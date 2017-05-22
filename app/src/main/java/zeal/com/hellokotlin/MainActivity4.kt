package zeal.com.hellokotlin

import android.content.Context
import android.os.Bundle
import android.support.annotation.UiThread
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import org.jetbrains.anko.*
import zeal.com.hellokotlin.jicheng.Person2

/**
 * Created by liaowj on 2017/5/22.
 */
class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //网络请求
        //普通方式
//        Thread() {
//            run {
//                Request("http://www.baidu.com").run();
//            }
//        }.start()

        //Anko提供了
        val async = async() {


            Request("http://www.baidu.com").run();
            //UIThread有一个很不错的一点就是可以依赖于调用者。
            // 如果它是被一个Activity调用的，那么如果activity.isFinishing()返回true，
            // 则uiThread不会执行，这样就不会在Activity销毁的时候遇到崩溃的情况了。
            uiThread {
                longToast("Request performed")
            }
        }
        System.out.println("async:" + async)
        val asyncResult = asyncResult() {
            Request("http://www.taobao.com").run();
            //UIThread有一个很不错的一点就是可以依赖于调用者。
            // 如果它是被一个Activity调用的，那么如果activity.isFinishing()返回true，
            // 则uiThread不会执行，这样就不会在Activity销毁的时候遇到崩溃的情况了。
            uiThread {
                longToast("Request performed2")
            }
        }
        System.out.println("asyncResult:" + asyncResult)
    }

}