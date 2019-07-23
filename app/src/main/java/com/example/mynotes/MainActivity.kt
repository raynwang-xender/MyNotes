package com.example.mynotes

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import org.json.JSONObject
import java.time.Duration

class MainActivity : AppCompatActivity() {


    companion object {   //object是静态 只能放全局
        val TAG: String = MainActivity::class.java.simpleName    //::两个冒号   类名::class.java  得到类的class对象

    }

    /**
     * Rayn
     * 扩展函数
     * 给Context添加一个toast的方法，那么在Activity Fragment Service中可以直接调用
     */
    fun Context.toast(message: String, duration: Int) {
        Toast.makeText(this, message, duration)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Rayn
         * gradle中引用    apply plugin: 'kotlin-android-extensions'
         * 直接就可以从布局文件里获取控件对象了，不需要findViewById
         */
        tv.setText("哈哈哈")

        toast("activity onCreate",Toast.LENGTH_SHORT)







        Normal_Object.var和val()
        Normal_Object.公共私有()
        Normal_Object.静态类()
        Normal_Object.感叹号()
        Normal_Object.问号()
        Normal_Object.等号()
        Normal_Object.lateinit()
        Normal_Object.区间两个点for循环()
        Normal_Object.两个冒号()
        Normal_Object.艾特()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {   //问号表示可以为空


        val TAG = "onActivityResult"
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
