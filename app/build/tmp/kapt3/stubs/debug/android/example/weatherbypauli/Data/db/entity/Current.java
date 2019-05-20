package android.example.weatherbypauli.Data.db.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "current_weather")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0016J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0013H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\nH\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\u00a9\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\nH\u00d6\u0001J\t\u0010C\u001a\u00020\u0013H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010 R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a\u00a8\u0006D"}, d2 = {"Landroid/example/weatherbypauli/Data/db/entity/Current;", "", "condition", "Landroid/example/weatherbypauli/Data/db/entity/Condition;", "feelslikeC", "", "feelslikeF", "gustKph", "gustMph", "isDay", "", "precipIn", "precipMm", "tempC", "tempF", "uv", "visKm", "visMiles", "windDir", "", "windKph", "windMph", "(Landroid/example/weatherbypauli/Data/db/entity/Condition;DDDDIDDDDIDDLjava/lang/String;DD)V", "getCondition", "()Landroid/example/weatherbypauli/Data/db/entity/Condition;", "getFeelslikeC", "()D", "getFeelslikeF", "getGustKph", "getGustMph", "id", "getId", "()I", "setId", "(I)V", "getPrecipIn", "getPrecipMm", "getTempC", "getTempF", "getUv", "getVisKm", "getVisMiles", "getWindDir", "()Ljava/lang/String;", "getWindKph", "getWindMph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Current {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "condition_")
    private final android.example.weatherbypauli.Data.db.entity.Condition condition = null;
    @com.google.gson.annotations.SerializedName(value = "feelslike_c")
    private final double feelslikeC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "feelslike_f")
    private final double feelslikeF = 0.0;
    @com.google.gson.annotations.SerializedName(value = "gust_kph")
    private final double gustKph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "gust_mph")
    private final double gustMph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "is_day")
    private final int isDay = 0;
    @com.google.gson.annotations.SerializedName(value = "precip_in")
    private final double precipIn = 0.0;
    @com.google.gson.annotations.SerializedName(value = "precip_mm")
    private final double precipMm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_c")
    private final double tempC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_f")
    private final double tempF = 0.0;
    private final int uv = 0;
    @com.google.gson.annotations.SerializedName(value = "vis_km")
    private final double visKm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "vis_miles")
    private final double visMiles = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind_dir")
    private final java.lang.String windDir = null;
    @com.google.gson.annotations.SerializedName(value = "wind_kph")
    private final double windKph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_mph")
    private final double windMph = 0.0;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.example.weatherbypauli.Data.db.entity.Condition getCondition() {
        return null;
    }
    
    public final double getFeelslikeC() {
        return 0.0;
    }
    
    public final double getFeelslikeF() {
        return 0.0;
    }
    
    public final double getGustKph() {
        return 0.0;
    }
    
    public final double getGustMph() {
        return 0.0;
    }
    
    public final int isDay() {
        return 0;
    }
    
    public final double getPrecipIn() {
        return 0.0;
    }
    
    public final double getPrecipMm() {
        return 0.0;
    }
    
    public final double getTempC() {
        return 0.0;
    }
    
    public final double getTempF() {
        return 0.0;
    }
    
    public final int getUv() {
        return 0;
    }
    
    public final double getVisKm() {
        return 0.0;
    }
    
    public final double getVisMiles() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWindDir() {
        return null;
    }
    
    public final double getWindKph() {
        return 0.0;
    }
    
    public final double getWindMph() {
        return 0.0;
    }
    
    public Current(@org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.db.entity.Condition condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int isDay, double precipIn, double precipMm, double tempC, double tempF, int uv, double visKm, double visMiles, @org.jetbrains.annotations.NotNull()
    java.lang.String windDir, double windKph, double windMph) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.example.weatherbypauli.Data.db.entity.Condition component1() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.example.weatherbypauli.Data.db.entity.Current copy(@org.jetbrains.annotations.NotNull()
    android.example.weatherbypauli.Data.db.entity.Condition condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int isDay, double precipIn, double precipMm, double tempC, double tempF, int uv, double visKm, double visMiles, @org.jetbrains.annotations.NotNull()
    java.lang.String windDir, double windKph, double windMph) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}