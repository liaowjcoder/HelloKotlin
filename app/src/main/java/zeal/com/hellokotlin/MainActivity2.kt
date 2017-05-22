package zeal.com.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.find

/**
 * Created by liaowj on 2017/5/22.
 */
class MainActivity2 : AppCompatActivity() {
    //你可以通过使用一个函数listOf创建一个常量的List
    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.forecast_layout);

        //as 表示强制转化的意思
        var forecastList = findViewById(R.id.forecast_list) as RecyclerView

        //Anko 的方式
        var forecastList2 : RecyclerView = find(R.id.forecast_list)

        //这里新创建一个对象并不是使用 new 的方式创建
        forecastList.layoutManager = LinearLayoutManager(this)

        forecastList.adapter = ForecastListAdapter(items);
    }
}