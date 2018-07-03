package com.example.kapil.kotlindemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by Kapil on 3/31/2018.
 */
class MainActivity : AppCompatActivity() {
    var userName : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView : TextView = findViewById(R.id.tv_welcome) as TextView

        userName = intent.getStringExtra("userName").toString()
        textView.setText("WelCome "+userName+"!!")
    }
}