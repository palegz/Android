package android.example.weatherbypauli.Data.db

import android.example.weatherbypauli.Data.db.entity.CURRENT_WEATHER_ID
import android.example.weatherbypauli.Data.db.entity.Current
import android.example.weatherbypauli.Data.db.unitlocalized.ImperialCurrentWeatherEntry
import android.example.weatherbypauli.Data.db.unitlocalized.MetricCurrentWeatherEntry
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


//Database functions for making the cached data show as Imperial or Metric
@Dao
interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
   fun upsert(weatherEntry: Current)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>

}