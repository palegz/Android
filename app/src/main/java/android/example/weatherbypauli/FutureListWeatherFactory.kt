package android.example.weatherbypauli

import android.example.weatherbypauli.Data.provider.UnitProvider
import android.example.weatherbypauli.Data.repository.ForecastRepository
import android.example.weatherbypauli.fragments.FutureListWeatherViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FutureListWeatherFactory(
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FutureListWeatherViewModel(
            forecastRepository,
            unitProvider
        ) as T
    }
}