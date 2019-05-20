package android.example.weatherbypauli.Data.db.unitlocalized

import androidx.room.ColumnInfo
import org.threeten.bp.LocalDate


data class MetricSimpleFutureEntry (
    @ColumnInfo(name = "date")
    override val date: LocalDate,
    @ColumnInfo(name = "avgtempC")
    override val avgTemperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIconUrl: String
) : UnitSpecificSimpleFutureEntry