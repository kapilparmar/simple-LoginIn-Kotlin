package com.example.kapil.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Kapil on 3/31/2018.
 */
class ActivityLogin : AppCompatActivity() {

    var  username :String =""
    var password : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var editUsername = findViewById(R.id.user_name) as EditText
        var editPassword = findViewById(R.id.user_pass) as EditText
        var btnLogin : Button = findViewById(R.id.btn_login) as Button


        btnLogin.setOnClickListener { v: View? ->
            username = editUsername.text.toString()
            password = editPassword.text.toString()

            if (username.isEmpty()){
                editUsername.setError("Please enter Username")
                return@setOnClickListener
            }
            else if(password.isEmpty()){
                editPassword.setError("Plaese enter password")
                return@setOnClickListener
            }
            else if (username.equals("kapil")&& password.equals("parmar")){
                var intent : Intent = Intent(this, MainActivity::class.java)
                intent.putExtra("userName",username)
                startActivity(intent)
                finish()

            }
            else
                Toast.makeText(this,"Plase enter valid Username and pass word", Toast.LENGTH_LONG).show()
        }



    }
}