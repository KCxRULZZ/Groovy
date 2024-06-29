package com.example.groovy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val secondActButton = findViewById<Button>(R.id.Signupbutton)
        secondActButton.setOnClickListener {
            val Intent = Intent(this, login::class.java)
            startActivity(Intent)
        }


    }
}