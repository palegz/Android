package android.example.weatherbypauli.Data.provider

import android.example.weatherbypauli.Data.db.entity.Location

interface LocationProvider {
    suspend fun hasLocationChanged(lastWeatherLocation: Location): Boolean
    suspend fun getPreferredLocationString(): String
}