package zeal.com.hellokotlin

import android.content.Context
import android.os.Bundle
import android.support.annotation.UiThread
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import org.jetbrains.anko.*
import zeal.com.hellokotlin.jicheng.Person2
import java.util.*

/**
 * Created by liaowj on 2017/5/22.
 */
class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        var args: List<String> = listOf<String>("hello", "kotlin");

//        for (arg in args) {
//            Log.e("zeal", "$arg");
//        }

//        var args: List<String> = listOf<String>("FR", "kotlin");
//        val language = if (args.size == 0) "EN" else args[0]
//        println(when (language) {
//            "EN" -> "Hello!"
//            "FR" -> "Salut!"
//            "IT" -> "Ciao!"
//            else -> "Sorry, I can't greet you in $language yet"
//        })

//        val value = max("1".toInt(), 2)
//        Log.e("zeal","value:"+value);


        //类型转换
//        val value = parseInt("a")
//        Log.e("zeal", "value:" + value);

        var length = getStringLength("hello world");
        Log.e("zeal", "length:" + length);
    }

    fun max(a: Int, b: Int) = if (a > b) a else b

    //Int? ?表示返回值可以为null
    fun parseInt(str: String): Int? {
        try {
            return str.toInt();
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null;
    }

    fun getStringLength(obj:Any) :Int?{
        if(obj is String) {
            return obj.length
        }
        return null
    }

}


