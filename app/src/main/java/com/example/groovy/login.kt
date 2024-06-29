package com.example.groovy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val secondActButton = findViewById<Button>(R.id.Signinbutton)
        secondActButton.setOnClickListener {
            val Intent = Intent(this, Home::class.java)
            startActivity(Intent)
        }
    }

}