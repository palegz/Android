package android.example.weatherbypauli.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(H\u0002J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020(H\u0002J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020(H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000f\u00a8\u00061"}, d2 = {"Landroid/example/weatherbypauli/fragments/CurrentWeatherFragment;", "Landroid/example/weatherbypauli/ScopedFragment;", "Lorg/kodein/di/KodeinAware;", "()V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "Lkotlin/Lazy;", "viewModel", "Landroid/example/weatherbypauli/fragments/CurrentWeatherViewModel;", "viewModelFactory", "Landroid/example/weatherbypauli/CurrentWeatherViewModelFactory;", "getViewModelFactory", "()Landroid/example/weatherbypauli/CurrentWeatherViewModelFactory;", "viewModelFactory$delegate", "bindUI", "Lkotlinx/coroutines/Job;", "chooseLocalizedUnitAbbreviation", "", "metric", "imperial", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "updateCondition", "condition", "updateDateToToday", "updateLocation", "location", "updatePrecipitation", "precipitation", "", "updateTemperature", "temperature", "feelslike", "updateVisibility", "visibilityDistance", "updateWind", "windDirection", "windSpeed", "app_debug"})
public final class CurrentWeatherFragment extends android.example.weatherbypauli.ScopedFragment implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy viewModelFactory$delegate = null;
    private android.example.weatherbypauli.fragments.CurrentWeatherViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final android.example.weatherbypauli.CurrentWeatherViewModelFactory getViewModelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job bindUI() {
        return null;
    }
    
    private final java.lang.String chooseLocalizedUnitAbbreviation(java.lang.String metric, java.lang.String imperial) {
        return null;
    }
    
    private final void updateLocation(java.lang.String location) {
    }
    
    private final void updateDateToToday() {
    }
    
    private final void updateTemperature(double temperature, double feelslike) {
    }
    
    private final void updateCondition(java.lang.String condition) {
    }
    
    private final void updatePrecipitation(double precipitation) {
    }
    
    private final void updateWind(java.lang.String windDirection, double windSpeed) {
    }
    
    private final void updateVisibility(double visibilityDistance) {
    }
    
    public CurrentWeatherFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}