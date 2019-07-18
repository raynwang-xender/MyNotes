package com.example.mynotes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    companion object {   //companion是静态 也只能放全局
        val TAG: String = MainActivity::class.java.simpleName    //::两个冒号   类名::class.java  得到类的class对象
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Normal.var和val()
        Normal.公共私有()
        Normal.静态类()
        Normal.感叹号()
        Normal.lateinit()

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
