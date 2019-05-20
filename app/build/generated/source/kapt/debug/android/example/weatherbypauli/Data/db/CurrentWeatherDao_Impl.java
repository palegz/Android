package android.example.weatherbypauli.Data.db;

import android.database.Cursor;
import android.example.weatherbypauli.Data.db.entity.Condition;
import android.example.weatherbypauli.Data.db.entity.Current;
import android.example.weatherbypauli.Data.db.unitlocalized.ImperialCurrentWeatherEntry;
import android.example.weatherbypauli.Data.db.unitlocalized.MetricCurrentWeatherEntry;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrentWeatherDao_Impl implements CurrentWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCurrent;

  public CurrentWeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrent = new EntityInsertionAdapter<Current>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `current_weather`(`id`,`feelslikeC`,`feelslikeF`,`gustKph`,`gustMph`,`isDay`,`precipIn`,`precipMm`,`tempC`,`tempF`,`uv`,`visKm`,`visMiles`,`windDir`,`windKph`,`windMph`,`condition_code`,`condition_icon`,`condition_text`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Current value) {
        stmt.bindLong(1, value.getId());
        stmt.bindDouble(2, value.getFeelslikeC());
        stmt.bindDouble(3, value.getFeelslikeF());
        stmt.bindDouble(4, value.getGustKph());
        stmt.bindDouble(5, value.getGustMph());
        stmt.bindLong(6, value.isDay());
        stmt.bindDouble(7, value.getPrecipIn());
        stmt.bindDouble(8, value.getPrecipMm());
        stmt.bindDouble(9, value.getTempC());
        stmt.bindDouble(10, value.getTempF());
        stmt.bindLong(11, value.getUv());
        stmt.bindDouble(12, value.getVisKm());
        stmt.bindDouble(13, value.getVisMiles());
        if (value.getWindDir() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getWindDir());
        }
        stmt.bindDouble(15, value.getWindKph());
        stmt.bindDouble(16, value.getWindMph());
        final Condition _tmpCondition = value.getCondition();
        if(_tmpCondition != null) {
          stmt.bindLong(17, _tmpCondition.getCode());
          if (_tmpCondition.getIcon() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindString(18, _tmpCondition.getIcon());
          }
          if (_tmpCondition.getText() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindString(19, _tmpCondition.getText());
          }
        } else {
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
        }
      }
    };
  }

  @Override
  public void upsert(final Current weatherEntry) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCurrent.insert(weatherEntry);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<MetricCurrentWeatherEntry> getWeatherMetric() {
    final String _sql = "select * from current_weather where id = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"current_weather"}, false, new Callable<MetricCurrentWeatherEntry>() {
      @Override
      public MetricCurrentWeatherEntry call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfFeelsLikeTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "feelslikeC");
          final int _cursorIndexOfPrecipitationVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "precipMm");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "tempC");
          final int _cursorIndexOfVisibilityDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "visKm");
          final int _cursorIndexOfWindDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "windDir");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windKph");
          final int _cursorIndexOfConditionIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "condition_icon");
          final int _cursorIndexOfConditionText = CursorUtil.getColumnIndexOrThrow(_cursor, "condition_text");
          final MetricCurrentWeatherEntry _result;
          if(_cursor.moveToFirst()) {
            final double _tmpFeelsLikeTemperature;
            _tmpFeelsLikeTemperature = _cursor.getDouble(_cursorIndexOfFeelsLikeTemperature);
            final double _tmpPrecipitationVolume;
            _tmpPrecipitationVolume = _cursor.getDouble(_cursorIndexOfPrecipitationVolume);
            final double _tmpTemperature;
            _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
            final double _tmpVisibilityDistance;
            _tmpVisibilityDistance = _cursor.getDouble(_cursorIndexOfVisibilityDistance);
            final String _tmpWindDirection;
            _tmpWindDirection = _cursor.getString(_cursorIndexOfWindDirection);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final String _tmpConditionIconUrl;
            _tmpConditionIconUrl = _cursor.getString(_cursorIndexOfConditionIconUrl);
            final String _tmpConditionText;
            _tmpConditionText = _cursor.getString(_cursorIndexOfConditionText);
            _result = new MetricCurrentWeatherEntry(_tmpTemperature,_tmpConditionText,_tmpConditionIconUrl,_tmpWindSpeed,_tmpWindDirection,_tmpPrecipitationVolume,_tmpFeelsLikeTemperature,_tmpVisibilityDistance);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<ImperialCurrentWeatherEntry> getWeatherImperial() {
    final String _sql = "select * from current_weather where id = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"current_weather"}, false, new Callable<ImperialCurrentWeatherEntry>() {
      @Override
      public ImperialCurrentWeatherEntry call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfFeelsLikeTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "feelslikeF");
          final int _cursorIndexOfPrecipitationVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "precipIn");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "tempF");
          final int _cursorIndexOfVisibilityDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "visMiles");
          final int _cursorIndexOfWindDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "windDir");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windMph");
          final int _cursorIndexOfConditionIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "condition_icon");
          final int _cursorIndexOfConditionText = CursorUtil.getColumnIndexOrThrow(_cursor, "condition_text");
          final ImperialCurrentWeatherEntry _result;
          if(_cursor.moveToFirst()) {
            final double _tmpFeelsLikeTemperature;
            _tmpFeelsLikeTemperature = _cursor.getDouble(_cursorIndexOfFeelsLikeTemperature);
            final double _tmpPrecipitationVolume;
            _tmpPrecipitationVolume = _cursor.getDouble(_cursorIndexOfPrecipitationVolume);
            final double _tmpTemperature;
            _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
            final double _tmpVisibilityDistance;
            _tmpVisibilityDistance = _cursor.getDouble(_cursorIndexOfVisibilityDistance);
            final String _tmpWindDirection;
            _tmpWindDirection = _cursor.getString(_cursorIndexOfWindDirection);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final String _tmpConditionIconUrl;
            _tmpConditionIconUrl = _cursor.getString(_cursorIndexOfConditionIconUrl);
            final String _tmpConditionText;
            _tmpConditionText = _cursor.getString(_cursorIndexOfConditionText);
            _result = new ImperialCurrentWeatherEntry(_tmpTemperature,_tmpConditionText,_tmpConditionIconUrl,_tmpWindSpeed,_tmpWindDirection,_tmpPrecipitationVolume,_tmpFeelsLikeTemperature,_tmpVisibilityDistance);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
