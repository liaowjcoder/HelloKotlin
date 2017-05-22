package zeal.com.hellokotlin.jicheng

import zeal.com.hellokotlin.jicheng.Animal

/**
 * Created by liaowj on 2017/5/22.
 *
 * kotlin 中默认所有的类的父类都是 Any 就像 java 中 Object 对象。
 *
 * 在默认情况所有类都是不可以被继承（final）的，所以我们只能明确去继承声明了
 * open/abstract 类型的。
 *
 */
class Person(name : String, age : Long) : Animal(name)