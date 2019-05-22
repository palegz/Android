package android.example.weatherbypauli


import android.example.weatherbypauli.Data.provider.CUSTOM_LOCATION
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    @Test
    fun isCustomLocationNotNull() {
        //is the customlocation value inside LocationProvider null
        //the app will crash if CUSTOM_LOCARTION == null
         assertNotNull(CUSTOM_LOCATION)
    }
}
