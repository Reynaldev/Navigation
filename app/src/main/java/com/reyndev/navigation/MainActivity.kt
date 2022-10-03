package com.reyndev.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.etName)
        val etCity: EditText = findViewById(R.id.etCity)

        val btnNext: Button = findViewById(R.id.btnNextActivity)
        btnNext.setOnClickListener {
            val name = etName.text.toString()
            val city = etCity.text.toString()

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name)
                it.putExtra("EXTRA_CITY", city)
                startActivity(it)
            }
        }
    }
}