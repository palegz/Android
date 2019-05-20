package android.example.weatherbypauli.Data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Landroid/example/weatherbypauli/Data/db/CurrentWeatherDao;", "", "getWeatherImperial", "Landroidx/lifecycle/LiveData;", "Landroid/example/weatherbypauli/Data/db/unitlocalized/ImperialCurrentWeatherEntry;", "getWeatherMetric", "Landroid/example/weatherbypauli/Data/db/unitlocalized/MetricCurrentWeatherEntry;", "upsert", "", "weatherEntry", "Landroid/example/weatherbypauli/Data/db/entity/Current;", "app_debug"})
public abstract interface CurrentWeatherDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.db.entity.Current weatherEntry);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from current_weather where id = 0")
    public abstract androidx.lifecycle.LiveData<android.example.weatherbypauli.Data.db.unitlocalized.MetricCurrentWeatherEntry> getWeatherMetric();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from current_weather where id = 0")
    public abstract androidx.lifecycle.LiveData<android.example.weatherbypauli.Data.db.unitlocalized.ImperialCurrentWeatherEntry> getWeatherImperial();
}