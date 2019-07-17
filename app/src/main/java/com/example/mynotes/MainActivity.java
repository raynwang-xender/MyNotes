package com.example.mynotes;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        String TAG = "onActivityResult";
        System.out.println(TAG + "---Rayn resultCode:"+requestCode);
        System.out.println(TAG + "---Rayn resultCode:"+resultCode);

        if (requestCode == 666){
            if (data == null) {
                System.out.println(TAG + "---Rayn data null ");
                return;
            }
            Bundle bundle = data.getExtras();
            if (bundle == null) {
                System.out.println(TAG + "---Rayn bundle null ");
                return;
            }
            JSONObject resultJson = new JSONObject();
            try {
                for (String s : bundle.keySet()) {
                    resultJson.put(s, bundle.get(s));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(TAG + "---Rayn resultJson:" + resultJson);
        }
    }
}
