package android.example.weatherbypauli

import android.app.Application
import android.content.Context
import android.example.weatherbypauli.Data.ApixuWeatherApiService
import android.example.weatherbypauli.Data.repository.ForecastRepository
import android.example.weatherbypauli.Data.repository.ForecastRepositoryImpl
import android.example.weatherbypauli.Data.WeatherNetworkDataSource
import android.example.weatherbypauli.Data.WeatherNetworkDataSourceImpl
import android.example.weatherbypauli.Data.db.ConnectivityInterceptor
import android.example.weatherbypauli.Data.db.ConnectivityInterceptorImpl
import android.example.weatherbypauli.Data.db.ForecastDatabase
import android.example.weatherbypauli.Data.db.WeatherLocationDao
import android.example.weatherbypauli.Data.provider.LocationProvider
import android.example.weatherbypauli.Data.provider.LocationProviderImpl
import android.example.weatherbypauli.Data.provider.UnitProvider
import android.example.weatherbypauli.Data.provider.UnitProviderImpl
import com.google.android.gms.location.LocationServices
import com.jakewharton.threetenabp.AndroidThreeTen
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

//Setting up kodein dependency injection

class ForecastApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@ForecastApplication))

        bind() from singleton { ForecastDatabase(instance()) }
        bind() from singleton { instance<ForecastDatabase>().currentWeatherDao() }
        bind() from singleton { instance<ForecastDatabase>().futureWeatherDao() }
        bind() from singleton { instance<ForecastDatabase>().weatherLocationDao() }
        bind<ConnectivityInterceptor>() with singleton {ConnectivityInterceptorImpl(instance()) }
        bind() from singleton { ApixuWeatherApiService(instance()) }
        bind<WeatherNetworkDataSource>() with singleton {WeatherNetworkDataSourceImpl(instance())}
        bind() from provider { LocationServices.getFusedLocationProviderClient(instance<Context>()) }
        bind<LocationProvider>() with singleton { LocationProviderImpl(instance(), instance())}
        bind<ForecastRepository>() with singleton { ForecastRepositoryImpl(instance(), instance(), instance(), instance(), instance())}
        bind<UnitProvider>() with singleton { UnitProviderImpl(instance()) }
        bind() from provider { CurrentWeatherViewModelFactory(instance(), instance()) }
        bind() from provider { FutureListWeatherFactory(instance(), instance()) }
    }

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}