package android.example.weatherbypauli.Data.db.unitlocalized

import org.threeten.bp.LocalDate

interface UnitSpecificSimpleFutureEntry {
        val date: LocalDate
        val avgTemperature: Double
        val conditionText: String
        val conditionIconUrl: String
}