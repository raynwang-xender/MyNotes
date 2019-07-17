package com.example.mynotes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import org.json.JSONObject

var toppp = "顶级变量"  //声明在类的外面 可理解为Java中的静态成员变量 会生成一个类名+kt的类（没找到）

class MainActivity : AppCompatActivity() {

    lateinit var name:String    //lateinit允许变量以后再赋值 后面只能接var 但是基本类型例如Int必须赋值 只能放在全局

    companion object{   //companion是静态 也只能放全局
        val TAG:String = MainActivity::class.java.simpleName    //::两个冒号？？？？？？？？？？
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var aaa = 1 //可自动倒推aaa类型为int
        var bbb = "Hello"
        var ccc:Int = 1 //也可以自己设置类型



    }

    fun aaa(){

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {   //问号？？？？？？？？


        val TAG = "onActivityResult"    //val是不可变量 类似final
        println("$TAG---Rayn resultCode:$requestCode")
        println("$TAG---Rayn resultCode:$resultCode")

        if (requestCode == 666) {
            if (data == null) {
                println("$TAG---Rayn data null ")
                return
            }
            val bundle = data.extras
            if (bundle == null) {
                println("$TAG---Rayn bundle null ")
                return
            }
            val resultJson = JSONObject()
            try {
                for (s in bundle.keySet()) {
                    resultJson.put(s, bundle.get(s))
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            println("$TAG---Rayn resultJson:$resultJson")
        }
    }
}
