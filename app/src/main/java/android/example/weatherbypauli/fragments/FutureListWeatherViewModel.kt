package android.example.weatherbypauli.fragments

import android.example.weatherbypauli.Data.provider.UnitProvider
import android.example.weatherbypauli.Data.repository.ForecastRepository
import android.example.weatherbypauli.lazyDeferred
import androidx.lifecycle.ViewModel;
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
