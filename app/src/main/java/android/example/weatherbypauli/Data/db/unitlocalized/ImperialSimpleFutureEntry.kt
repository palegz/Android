package android.example.weatherbypauli.Data.db.unitlocalized

import androidx.room.ColumnInfo
import org.threeten.bp.LocalDate

class ImperialSimpleFutureEntry (
    @ColumnInfo(name = "date")
    override val date: LocalDate,
    @ColumnInfo(name = "avgtempF")
    override val avgTemperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIconUrl: String
) : UnitSpecificSimpleFutureEntry
