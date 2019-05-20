package android.example.weatherbypauli.Data

import android.example.weatherbypauli.Data.response.CurrentWeatherResponse
import android.example.weatherbypauli.Data.response.FutureWeatherResponse
import androidx.lifecycle.LiveData

interface WeatherNetworkDataSource {
    val downloadCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>


    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
    suspend fun fetchFutureWeather(
        location: String,
        languageCode: String
    )

}