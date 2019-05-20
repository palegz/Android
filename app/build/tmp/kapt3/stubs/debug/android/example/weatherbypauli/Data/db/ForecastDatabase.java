package android.example.weatherbypauli.Data.db;

import java.lang.System;

@androidx.room.Database(entities = {android.example.weatherbypauli.Data.db.entity.Current.class, android.example.weatherbypauli.Data.db.entity.Location.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Landroid/example/weatherbypauli/Data/db/ForecastDatabase;", "Landroidx/room/RoomDatabase;", "()V", "currentWeatherDao", "Landroid/example/weatherbypauli/Data/db/CurrentWeatherDao;", "weatherLocationDao", "Landroid/example/weatherbypauli/Data/db/WeatherLocationDao;", "Companion", "app_debug"})
public abstract class ForecastDatabase extends androidx.room.RoomDatabase {
    private static volatile android.example.weatherbypauli.Data.db.ForecastDatabase instance;
    private static final java.lang.Object LOCK = null;
    public static final android.example.weatherbypauli.Data.db.ForecastDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.example.weatherbypauli.Data.db.CurrentWeatherDao currentWeatherDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.example.weatherbypauli.Data.db.WeatherLocationDao weatherLocationDao();
    
    public ForecastDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Landroid/example/weatherbypauli/Data/db/ForecastDatabase$Companion;", "", "()V", "LOCK", "instance", "Landroid/example/weatherbypauli/Data/db/ForecastDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.example.weatherbypauli.Data.db.ForecastDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final android.example.weatherbypauli.Data.db.ForecastDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}