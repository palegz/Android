package android.example.weatherbypauli.Data.response

import android.example.weatherbypauli.Data.db.entity.Forecast
import android.example.weatherbypauli.Data.db.entity.Location


data class FutureWeatherResponse(
    val forecast: Forecast,
    val location: Location
)