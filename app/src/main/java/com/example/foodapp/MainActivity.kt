package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private val ref= FirebaseAuth.getInstance()


    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var loginBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<Button>(R.id.buttonLogin)
        login.setOnClickListener {
            val intent= Intent(this, Signin_activity::class.java)
            startActivity(intent)
        }
        val register =findViewById<Button>(R.id.buttonRegister)
        register.setOnClickListener {
            val intent= Intent(this, Sign_up_activity::class.java)
            startActivity(intent)
        }
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
        loginBtn=findViewById(R.id.login)

        loginBtn.setOnClickListener {
            ref.createUserWithEmailAndPassword(
                email.text.toString().trim(),
                password.text.toString().trim()
            )
        }
    }
}