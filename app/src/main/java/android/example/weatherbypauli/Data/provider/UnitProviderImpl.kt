package android.example.weatherbypauli.Data.provider

import android.content.Context
import android.content.SharedPreferences
import android.example.weatherbypauli.UnitSystem
import android.preference.PreferenceManager

const val UNIT_SYSTEM = "UNIT_SYSTEM"

class UnitProviderImpl(context: Context) :PreferenceProvider(context), UnitProvider {

    override fun getUnitSystem(): UnitSystem {
        val selectedName = preferences.getString(UNIT_SYSTEM, UnitSystem.METRIC.name)
        return UnitSystem.valueOf(selectedName!!)

    }
}