package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Sign_up_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val login =findViewById<TextView>(R.id.already)
        login.setOnClickListener {
            val intent= Intent(this, Signin_activity::class.java)
            startActivity(intent)
        }
    }
}