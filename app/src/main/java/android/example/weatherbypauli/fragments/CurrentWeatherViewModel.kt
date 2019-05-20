package android.example.weatherbypauli.fragments

import android.example.weatherbypauli.Data.provider.UnitProvider
import android.example.weatherbypauli.Data.repository.ForecastRepository
import android.example.weatherbypauli.UnitSystem
import android.example.weatherbypauli.lazyDeferred
import androidx.lifecycle.ViewModel;

class CurrentWeatherViewModel (
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
): ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred{
        forecastRepository.getCurrentWeather(isMetric)
      }
    val weatherLocation by lazyDeferred{
        forecastRepository.getWeatherLocation()
    }
    }
