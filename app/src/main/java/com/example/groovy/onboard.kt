package com.example.groovy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        val secondActButton = findViewById<Button>(R.id.button3)
        secondActButton.setOnClickListener {
            val Intent = Intent(this, signup::class.java)
            startActivity(Intent)
        }
    }
}