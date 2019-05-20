package android.example.weatherbypauli.Data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u0016\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Landroid/example/weatherbypauli/Data/repository/ForecastRepositoryImpl;", "Landroid/example/weatherbypauli/Data/repository/ForecastRepository;", "currentWeatherDao", "Landroid/example/weatherbypauli/Data/db/CurrentWeatherDao;", "weatherNetworkDataSource", "Landroid/example/weatherbypauli/Data/WeatherNetworkDataSource;", "weatherLocationDao", "Landroid/example/weatherbypauli/Data/db/WeatherLocationDao;", "locationProvider", "Landroid/example/weatherbypauli/Data/provider/LocationProvider;", "(Landroid/example/weatherbypauli/Data/db/CurrentWeatherDao;Landroid/example/weatherbypauli/Data/WeatherNetworkDataSource;Landroid/example/weatherbypauli/Data/db/WeatherLocationDao;Landroid/example/weatherbypauli/Data/provider/LocationProvider;)V", "fetchCurrentWeather", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "Landroid/example/weatherbypauli/Data/db/unitlocalized/UnitSpecificCurrentWeatherEntry;", "metric", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherLocation", "Landroid/example/weatherbypauli/Data/db/entity/Location;", "initWeatherData", "isFetchCurrentNeeded", "lastFetchTime", "Ljava/time/ZonedDateTime;", "persistFetchedCurrentWeather", "fetchedWeather", "Landroid/example/weatherbypauli/Data/response/CurrentWeatherResponse;", "app_debug"})
public final class ForecastRepositoryImpl implements android.example.weatherbypauli.Data.repository.ForecastRepository {
    private final android.example.weatherbypauli.Data.db.CurrentWeatherDao currentWeatherDao = null;
    private final android.example.weatherbypauli.Data.WeatherNetworkDataSource weatherNetworkDataSource = null;
    private final android.example.weatherbypauli.Data.db.WeatherLocationDao weatherLocationDao = null;
    private final android.example.weatherbypauli.Data.provider.LocationProvider locationProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentWeather(boolean metric, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<? extends android.example.weatherbypauli.Data.db.unitlocalized.UnitSpecificCurrentWeatherEntry>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherLocation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<android.example.weatherbypauli.Data.db.entity.Location>> p0) {
        return null;
    }
    
    private final void persistFetchedCurrentWeather(android.example.weatherbypauli.Data.response.CurrentWeatherResponse fetchedWeather) {
    }
    
    private final boolean isFetchCurrentNeeded(java.time.ZonedDateTime lastFetchTime) {
        return false;
    }
    
    public ForecastRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.db.CurrentWeatherDao currentWeatherDao, @org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.WeatherNetworkDataSource weatherNetworkDataSource, @org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.db.WeatherLocationDao weatherLocationDao, @org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.provider.LocationProvider locationProvider) {
        super();
    }
}