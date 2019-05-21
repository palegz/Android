package android.example.weatherbypauli.Data.repository

import android.example.weatherbypauli.Data.db.entity.Location
import android.example.weatherbypauli.Data.db.unitlocalized.UnitSpecificCurrentWeatherEntry
import android.example.weatherbypauli.Data.db.unitlocalized.UnitSpecificSimpleFutureEntry
import androidx.lifecycle.LiveData
import org.threeten.bp.LocalDate

interface ForecastRepository{
    suspend fun getCurrentWeather(metric: Boolean) : LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<UnitSpecificSimpleFutureEntry>>
    suspend fun getWeatherLocation(): LiveData<Location>
}