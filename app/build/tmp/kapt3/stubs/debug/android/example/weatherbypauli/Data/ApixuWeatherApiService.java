package android.example.weatherbypauli.Data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Landroid/example/weatherbypauli/Data/ApixuWeatherApiService;", "", "getCurrentWeather", "Lkotlinx/coroutines/Deferred;", "Landroid/example/weatherbypauli/Data/response/CurrentWeatherResponse;", "location", "", "languageCode", "Companion", "app_debug"})
public abstract interface ApixuWeatherApiService {
    public static final android.example.weatherbypauli.Data.ApixuWeatherApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "current.json")
    public abstract kotlinx.coroutines.Deferred<android.example.weatherbypauli.Data.response.CurrentWeatherResponse> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lang")
    java.lang.String languageCode);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Landroid/example/weatherbypauli/Data/ApixuWeatherApiService$Companion;", "", "()V", "invoke", "Landroid/example/weatherbypauli/Data/ApixuWeatherApiService;", "connectivityInterceptor", "Landroid/example/weatherbypauli/Data/db/ConnectivityInterceptor;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.example.weatherbypauli.Data.ApixuWeatherApiService invoke(@org.jetbrains.annotations.NotNull()
        android.example.weatherbypauli.Data.db.ConnectivityInterceptor connectivityInterceptor) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}