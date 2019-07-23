package com.example.mynotes

/**
 * Rayn
 * Data class
 * 类似于Java中的 Java bean
    优点：自动生成equals()/hashCode()，toString()方法，componentN()方法，copy()方法，不需要重写get/set方法

主构造函数必须要至少有一个参数（这一点有点不友好）
主构造函数中的所有参数必须被标记为val或者var(次级构造函数可以不用)，且不能有任何代码快
数据类不能有以下修饰符：abstract，inner,open,sealed
 *
 */
data class DataTest constructor(var name: String) {

}