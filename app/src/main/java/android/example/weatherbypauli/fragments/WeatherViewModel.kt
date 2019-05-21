package android.example.weatherbypauli.fragments

import android.example.weatherbypauli.Data.provider.UnitProvider
import android.example.weatherbypauli.Data.repository.ForecastRepository
import android.example.weatherbypauli.UnitSystem
import android.example.weatherbypauli.lazyDeferred
import androidx.lifecycle.ViewModel

abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}