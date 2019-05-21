package android.example.weatherbypauli.Data.db

import android.example.weatherbypauli.Data.db.entity.Location
import android.example.weatherbypauli.Data.db.entity.WEATHER_LOCATION_ID
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query



@Dao
interface WeatherLocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherLocation: Location)

    @Query ("select * from weather_location where id = $WEATHER_LOCATION_ID")
    fun getLocation(): LiveData<Location>

    @Query("select * from weather_location where id = $WEATHER_LOCATION_ID")
    fun getLocationNonLive(): Location?
}