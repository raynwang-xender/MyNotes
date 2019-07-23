package com.example.mynotes


/**
 * Rayn
 *  abstract 抽象类
final 类不可被继承  Kotlin 默认的是final
enum 枚举类
open 类可继承
annotation 注解类
 *
 */


class Normal constructor(name: String) {

    /**
     * Rayn
     * main函数写法二
     *  1.括号里要加东西
     *  2.放在静态里
     *  3.注解
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Normal_Object.艾特()
        }
    }

    var name: String

    /**
     * Rayn
     * 主构造器
     * 里面不能进行初始化，赋值等，要放到init()方法里
     * 次构造器没有次限制
     */
    init {
        this.name = name
    }

    var id: Int = 0

    /**
     * Rayn
     * 次构造器
     * 必须继承主构造器
     */
    constructor(name: String, id: Int) : this(name) {
        this.id = id
    }


}