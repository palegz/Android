package android.example.weatherbypauli.Data.response

import android.example.weatherbypauli.Data.db.entity.Current
import android.example.weatherbypauli.Data.db.entity.Location
import com.google.gson.annotations.SerializedName

//Data class for the CUrrent weather JSON Response
data class CurrentWeatherResponse(
    val current: Current,
    val location: Location
)