package android.example.weatherbypauli;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Landroid/example/weatherbypauli/CurrentWeatherViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "forecastRepository", "Landroid/example/weatherbypauli/Data/repository/ForecastRepository;", "unitProvider", "Landroid/example/weatherbypauli/Data/provider/UnitProvider;", "(Landroid/example/weatherbypauli/Data/repository/ForecastRepository;Landroid/example/weatherbypauli/Data/provider/UnitProvider;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class CurrentWeatherViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
    private final android.example.weatherbypauli.Data.repository.ForecastRepository forecastRepository = null;
    private final android.example.weatherbypauli.Data.provider.UnitProvider unitProvider = null;
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public CurrentWeatherViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.repository.ForecastRepository forecastRepository, @org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.provider.UnitProvider unitProvider) {
        super();
    }
}