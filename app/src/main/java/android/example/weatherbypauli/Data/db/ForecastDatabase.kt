package android.example.weatherbypauli.Data.db

import android.content.Context
import android.example.weatherbypauli.Data.db.entity.Current
import android.example.weatherbypauli.Data.db.entity.Forecastday
import android.example.weatherbypauli.Data.db.entity.Location
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    //Current is the current weather response from the API
    entities = [Current::class, Location::class, Forecastday::class],
    version = 1
)
@TypeConverters(LocalDateConverter::class)
abstract class ForecastDatabase : RoomDatabase(){
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun futureWeatherDao(): FutureWeatherDao
    abstract fun weatherLocationDao(): WeatherLocationDao

    companion object{
        @Volatile private var instance: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {instance = it}
        }
        private fun buildDatabase(context: Context) =
                Room.databaseBuilder(context.applicationContext,
                    ForecastDatabase::class.java, "forecast.db")
                    .build()
    }

}