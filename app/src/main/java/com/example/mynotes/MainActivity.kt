package com.example.mynotes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

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
