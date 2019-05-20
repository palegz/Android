package android.example.weatherbypauli.Data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Landroid/example/weatherbypauli/Data/WeatherNetworkDataSourceImpl;", "Landroid/example/weatherbypauli/Data/WeatherNetworkDataSource;", "apixuWeatherApiService", "Landroid/example/weatherbypauli/Data/ApixuWeatherApiService;", "(Landroid/example/weatherbypauli/Data/ApixuWeatherApiService;)V", "_downloadedCurrentWeather", "Landroidx/lifecycle/MutableLiveData;", "Landroid/example/weatherbypauli/Data/response/CurrentWeatherResponse;", "downloadCurrentWeather", "Landroidx/lifecycle/LiveData;", "getDownloadCurrentWeather", "()Landroidx/lifecycle/LiveData;", "fetchCurrentWeather", "", "location", "", "languageCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherNetworkDataSourceImpl implements android.example.weatherbypauli.Data.WeatherNetworkDataSource {
    private final androidx.lifecycle.MutableLiveData<android.example.weatherbypauli.Data.response.CurrentWeatherResponse> _downloadedCurrentWeather = null;
    private final android.example.weatherbypauli.Data.ApixuWeatherApiService apixuWeatherApiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.example.weatherbypauli.Data.response.CurrentWeatherResponse> getDownloadCurrentWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    public WeatherNetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.ApixuWeatherApiService apixuWeatherApiService) {
        super();
    }
}