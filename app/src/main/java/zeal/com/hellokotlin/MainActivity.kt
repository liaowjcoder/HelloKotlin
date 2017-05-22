package zeal.com.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//手动导入这个包，就可以像操作属性一样去操作Java库中的getter/setter方法
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //textView = findViewById(R.id.textview) as TextView

        //textView!!.text = "hello kotlin..."

        textview.text = "hello kotlin...."

        toast(textview.text.toString())
//        niceToast(textview.text.toString())
    }

    /**
     * 定义一个 toast 方法，注意第二个参数，我们给第二个参数设置了一个默认值
     * 这样在调用的时候就可选性
     * 例如：toast("hello kotin")
     * toast("hello kotin",Toast.LENGTH_LONG)
     */
    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }

//    fun niceToast(message: String, tag: String
//    = javaClass.getSimpleName(),
//                  length: Int = Toast.LENGTH_SHORT) {
//
//        Toast.makeText(this, "[$className]$message", length).show()
//    }
}
