package com.example.groovy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class logo : AppCompatActivity() {
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@logo, onboard::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}