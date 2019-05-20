package android.example.weatherbypauli

import android.example.weatherbypauli.Data.provider.UnitProvider
import android.example.weatherbypauli.Data.repository.ForecastRepository
import android.example.weatherbypauli.fragments.CurrentWeatherViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CurrentWeatherViewModelFactory(
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CurrentWeatherViewModel(forecastRepository, unitProvider) as T }
}