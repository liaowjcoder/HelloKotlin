package zeal.com.hellokotlin.jicheng

/**
 * Created by liaowj on 2017/5/22.
 */
class Person2() {
    //定义变量 name 不过 kotin 语法中需要为其指定初始值
    var name: String = ""
            //自定义 getter/setter 方法
        get() = field.toUpperCase()
        set(value) {
            field = "$value"
        }

    var age: Int = 0
        get() = 100;

}