package zeal.com.hellokotlin

import android.util.Log

/**
 * Created by liaowj on 2017/5/22.
 */
class User(name: String) {

    init {
        Log.e("user", "name:" + name);
    }
}