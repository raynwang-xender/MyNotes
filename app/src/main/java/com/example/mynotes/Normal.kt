package com.example.mynotes

import kotlin.properties.Delegates


var toppp = "顶级变量"  //声明在类的外面 可理解为Java中的静态成员变量 会生成一个类名+kt的类（没找到）

object Normal {

    fun 静态类(){
        /**
         * Rayn
         * 静态类只要把类名钱的class改成object就行，所有的方法都是静态方法
         *
         * 如果类不是静态的，用companion
         */
    }

    lateinit var name: String
    fun lateinit() {
        /**
         * Rayn
         * lateinit允许变量以后再赋值 后面只能接var
         * 只能放在全局
         * String后面就不用接?了 因为本来lateinit就是可以暂时为空的意思
         * 但是基本类型例如Int必须赋值
         */

        /** ---Rayn 对于Int可以这样委托 */
        var num:Int by Delegates.notNull<Int>()
    }




    fun var和val() {
        /**
         * Rayn
         * Kotlin让你在语言层面思考不可变性。val是只读的，var是可变的。建议你尽可能多的使用只读属性。它们是线程安全的，并且在函数式编程中很好用。
         */

        /** ---Rayn 尽量先使用val */

    }

    fun 公共私有() {
        /**
         * Rayn
         * public       公有 不声明的时候默认就是public 与java不一样 java默认是default
         * internal     模块 同一个module下可用
         * protected    私有+子类 不可声明顶层变量、方法、类、接口等，同一个类或其子类
         * private      私有 只能在同一个类
         */

        /** ---Rayn 尽量先使用private */
    }


    lateinit var b: String
    fun 感叹号() {
        /**
         * Rayn
         * 空安全是Kotlin提供的功能之一。它让你思考语言级别的可空性，所以你可以避免在Java中很常见的NullPointerException。
         * 但是，当你自动将Java代码转换为Kotlin时，你会看到很多!!符号。这意味着“你在这里有一个潜在的未处理的KotlinNullPointerException”。
         * 可以使用val和latainit来避免使用!!符号
         */

        /** ---Rayn a是可能为空的 编译不过 如果加上!!就编译通过 */
        var a: String? = null
        a!!.length

        /** ---Rayn 用lateinit就不需要用!! 但是我怎么感觉有坑 本来!!是好的 */
        b.length

    }


    /**
     * Rayn
     * function 方法名
     * 括号后面记得加冒号
     * String是返回值
     * ？表示可以为空
     */
    fun function(): String? {

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
        var dd = bb?.length ?: -1   //如果bb是空就返回-1 不是4空就正常返回bb的长度

        /**    !!   对象不为空时执行 不懂    */


        return b


    }

}