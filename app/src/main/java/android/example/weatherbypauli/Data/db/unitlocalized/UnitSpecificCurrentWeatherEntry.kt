package android.example.weatherbypauli.Data.db.unitlocalized


//Interface for data which metric and imperial classes will inherit and override the vals
//with their own stuff

interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
    val conditionText: String
    val conditionIconUrl: String
    val windSpeed: Double
    val windDirection: String
    val precipitationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
}