package com.example.mynotes

/**
 * Rayn
 * public       公有 不声明的时候默认就是public 与java不一样 java默认是default
 * internal     模块 同一个module下可用
 * protected    私有+子类 不可声明顶层变量、方法、类、接口等，同一个类或其子类
 * private      私有 只能在同一个类
 */

var toppp = "顶级变量"  //声明在类的外面 可理解为Java中的静态成员变量 会生成一个类名+kt的类（没找到）

class Normal {

    lateinit var name: String    //lateinit允许变量以后再赋值 后面只能接var 但是基本类型例如Int必须赋值 只能放在全局

    companion object {   //companion是静态 也只能放全局
        val TAG: String = MainActivity::class.java.simpleName    //::两个冒号？？？？？？？？？？
    }

    fun function1() {

        //如果定义常量时进行了初始化,就可以不指定数据类型,kotlin编译器会自动根据右侧的值推导数据类型.
        //如果定义变量未进行初始化,就必须制定法数据类型
        var a = 1 //可自动倒推aaa类型为Int    int->Int float->Float
        var b = "Hello"
        var c: Float = 1.5F   //也可以自己设置类型

        /**    ?    表示可以为空    */
        var aa = "abc"
//    aa = null   //编译不过
        var bb: String? = "abc"
        bb = null   //编译通过

//    var cc = bb.length  //编译不过 因为bb有可能是空
        var cc = bb?.length //编译通过 bb可以为空 如果bb是空就返回cc是空

        /**    ?:   类似java的三目运算 前面的为空就返回后面的    */
        var dd = bb?.length ?: -1   //如果bb是空就返回-1 不是空就正常返回bb的长度

        /**    !!   对象不为空时执行 不懂    */


    }

}