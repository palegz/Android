package android.example.weatherbypauli.Data.db

import android.content.Context
import android.example.weatherbypauli.Data.db.entity.Current
import android.example.weatherbypauli.Data.db.entity.Location
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    //Current is the current weather response from the API
    entities = [Current::class, Location::class],
    version = 1
)
abstract class ForecastDatabase : RoomDatabase(){
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun futureWeatherDaoU(): FutureWeatherDao
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