package android.example.weatherbypauli.Data.db

import android.content.Context
import android.example.weatherbypauli.NoConnectivityException
import android.net.ConnectivityManager
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class ConnectivityInterceptorImpl(context : Context) : ConnectivityInterceptor {

    private val appContext  = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if(!isOnline())
            throw NoConnectivityException()
        return chain.proceed(chain.request())
    }
    //Function to check if the phone is connected to network or not, using ACCES NETWORK STATE f om manifest
    private fun isOnline(): Boolean{
        val connectivityManager = appContext.getSystemService(Context.CONNECTIVITY_SERVICE)
        as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected



    }
}