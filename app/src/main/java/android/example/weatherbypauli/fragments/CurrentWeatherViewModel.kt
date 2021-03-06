package android.example.weatherbypauli.fragments

import android.example.weatherbypauli.Data.provider.UnitProvider
import android.example.weatherbypauli.Data.repository.ForecastRepository
import android.example.weatherbypauli.UnitSystem
import android.example.weatherbypauli.lazyDeferred
import androidx.lifecycle.ViewModel;

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}

