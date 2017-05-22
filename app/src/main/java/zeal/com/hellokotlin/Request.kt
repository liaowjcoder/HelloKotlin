package zeal.com.hellokotlin

import android.util.Log
import java.net.URL

/**
 * Created by liaowj on 2017/5/22.
 */
class Request(var url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText();

        Log.e(javaClass.simpleName, forecastJsonStr)
    }
}