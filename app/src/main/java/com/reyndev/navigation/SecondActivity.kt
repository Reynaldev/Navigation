package com.reyndev.navigation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("EXTRA_NAME")
        val city = intent.getStringExtra("EXTRA_CITY")

        val tvName: TextView = findViewById(R.id.tvName)
        tvName.text = "Name: $name"

        val tvCity: TextView = findViewById(R.id.tvCity)
        tvCity.text = "City: $city"

        val btnReturn: Button = findViewById(R.id.btnReturn)
        btnReturn.setOnClickListener {
            finish()
        }
    }
}