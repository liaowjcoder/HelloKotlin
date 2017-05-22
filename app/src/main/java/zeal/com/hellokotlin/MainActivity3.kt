package zeal.com.hellokotlin

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import org.jetbrains.anko.toast
import zeal.com.hellokotlin.jicheng.Person2

/**
 * Created by liaowj on 2017/5/22.
 */
class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        testVariable()
    }

    fun testVariable() {
//基本数据类型：
//        val i: Int = 7;
//        val d = i.toDouble();
//        //System.out: i=7,d=7.0
//        System.out.println("i=" + i + ",d=" + d);

//        val c: Char = 'c'
//        //字符（Char）不能直接作为一个数字来处理。在需要时我们需要把他们转换为一个数字
//        val i: Int = c.toInt();
        //System.out: c=c,i=99
//        System.out.println("c=" + c + ",i=" + i);


        //指定明确的类型，让编译器去判断。
//        val i = 12;
//        val l = 13L;
//        val f = 1.4f;
//        val s = "hello kotlin"
//        System.out.println("i=" + i);//i=12
//        System.out.println("l=" + l);//l=13
//        System.out.println("f=" + f);//f=1.4
//        System.out.println("s=" + s);//s=hello kotlin

        //String 也可以像数组那样去访问
//        val s: String = "hello kotlin"
//        val c: Char = s[6];
//        System.out.println("c=" + c);//c=k
//        //迭代该 s
//        for (c1 : Char in s) {
//            System.out.println("c=" + c1);//c=k
//        }


        //变量的类型分为两种：
        //var 表示可变的， val 表示不可变的类型
//        val s = "123"
//        //这种方式是不对的，因为 s 被定义为不可改变的，因此不能再为其赋值。
//        s = "456";
//        System.out.println("s=" + s);


        //属性
        //自定义 setter/getter 方法
//        val p = Person2();
//        p.name = "BAT";
//        p.age = 27
//        //System.out: BAT:27
//        System.out.println(p.name + ":" + p.age);

    }
}