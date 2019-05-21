package android.example.weatherbypauli.fragments

import android.example.weatherbypauli.Data.db.unitlocalized.MetricSimpleFutureEntry
import android.example.weatherbypauli.Data.db.unitlocalized.UnitSpecificSimpleFutureEntry
import android.example.weatherbypauli.GlideApp
import android.example.weatherbypauli.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_future_weather.*
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.FormatStyle


class FutureWeatherItem(
    val weatherEntry: UnitSpecificSimpleFutureEntry
) : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.apply {
            tv_condition.text = weatherEntry.conditionText
            updateDate()
            updateTemperature()
            updateConditionImage()
        }
    }

    override fun getLayout() = R.layout.item_future_weather

    private fun ViewHolder.updateDate() {
        val dtFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
        tv_date.text = weatherEntry.date.format(dtFormatter)
    }

    private fun ViewHolder.updateTemperature() {
        val unitAbbreviation = if (weatherEntry is MetricSimpleFutureEntry) "°C"
        else "°F"
        tv_temperature.text = "${weatherEntry.avgTemperature}$unitAbbreviation"
    }

    private fun ViewHolder.updateConditionImage() {
        GlideApp.with(this.containerView)
            .load("https:" + weatherEntry.conditionIconUrl)
            .into(imageView_condition_icon)
    }
}