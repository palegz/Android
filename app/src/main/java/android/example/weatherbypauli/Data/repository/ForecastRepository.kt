package android.example.weatherbypauli.Data.repository

import android.example.weatherbypauli.Data.db.entity.Location
import android.example.weatherbypauli.Data.db.unitlocalized.UnitSpecificCurrentWeatherEntry
import androidx.lifecycle.LiveData

interface ForecastRepository{
    suspend fun getCurrentWeather(metric: Boolean) : LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getWeatherLocation(): LiveData<Location>
}