package android.example.weatherbypauli.fragments

import android.example.weatherbypauli.CurrentWeatherViewModelFactory
import android.example.weatherbypauli.GlideApp
import android.example.weatherbypauli.R
import android.example.weatherbypauli.ScopedFragment
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.current_weather_fragment.*
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein
import org.kodein.di.generic.instance

//scoped fragment to use suspended functions with coroutines that couldnt be used with global scope
class CurrentWeatherFragment : ScopedFragment(), KodeinAware {
    override val kodein by closestKodein()
    private val viewModelFactory: CurrentWeatherViewModelFactory by instance()

    private lateinit var viewModel: CurrentWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_weather_fragment, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(CurrentWeatherViewModel::class.java)
        bindUI()
    }

private fun bindUI()  = launch{
    val currentWeather = viewModel.weather.await()
    val weatherLocation = viewModel.weatherLocation.await()

    //Observe location and update if needed
    weatherLocation.observe(this@CurrentWeatherFragment, Observer { location ->
        if (location == null)  return@Observer
        updateLocation(location.name)
    })


    currentWeather.observe(this@CurrentWeatherFragment, Observer {
     if (it == null) return@Observer
        //keep the loading bar if untill the Observed data is not null
        group_loading.visibility = View.GONE

        //Then update datasets
     updateDateToToday()
     updateTemperature(it.temperature, it.feelsLikeTemperature)
     updateCondition(it.conditionText)
     updatePrecipitation(it.precipitationVolume)
     updateWind(it.windDirection, it.windSpeed)
     updateVisibility(it.visibilityDistance)
        //Get the weather icon from the api with GLIDE plugin
        //android API level 28 needs HTTPS calls to work properly
        GlideApp.with(this@CurrentWeatherFragment)
         .load("https:${it.conditionIconUrl}")
         .into(iv_condition_icon)
 })
}
    private fun chooseLocalizedUnitAbbreviation(metric: String, imperial: String) : String{
        return if (viewModel.isMetricUnit) metric else imperial
    }

    // Make the actionbar display the location as the title of the action bar
    private fun updateLocation(location: String) {
        (activity as? AppCompatActivity)?.supportActionBar?.title = location
    }
    //subtitle for the top actionbar to display today
    private fun updateDateToToday() {
        (activity as? AppCompatActivity)?.supportActionBar?.subtitle = "Today"
    }
    //check if the settings has metric or imperial system and display temperature correctly
    private fun updateTemperature(temperature: Double, feelslike: Double){
        val unitAbbrevation = chooseLocalizedUnitAbbreviation("°C","°F")
        tv_temperature.text = "$temperature$unitAbbrevation"
        tv_feelslike_temperature.text = "Feels like $feelslike$unitAbbrevation"
    }
    //update current condition of the waether
    private fun updateCondition(condition: String) {
        tv_condition.text = condition
    }
    //Update method for the precipitation volume
    private fun updatePrecipitation(precipitation: Double) {
        val unitAbbreviation = chooseLocalizedUnitAbbreviation("mm","in")
        tv_precipitation.text = "Precipitation: $precipitation $unitAbbreviation"
    }
    //Same as before, update weather data from JSON to display on the screen
    private fun updateWind(windDirection: String, windSpeed: Double) {
        val unitAbbreviation = chooseLocalizedUnitAbbreviation("kph", "mph")
        tv_wind.text = "Wind: $windDirection, $windSpeed $unitAbbreviation"
    }

    private fun updateVisibility(visibilityDistance: Double) {
        val unitAbbreviation = chooseLocalizedUnitAbbreviation("km", "mi.")
        tv_visibility.text = "Visibility: $visibilityDistance $unitAbbreviation"
    }
}
