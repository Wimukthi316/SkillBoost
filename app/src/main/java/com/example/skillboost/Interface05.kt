package com.example.skillboost

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Interface05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interface05)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Interface04 when back arrow is clicked
        val backArrow = findViewById<ImageView>(R.id.imageView40)
        backArrow.setOnClickListener {
            val intent = Intent(this, Interface04::class.java)
            startActivity(intent)
            finish() // Optional: Close Interface05 when going back
        }

        // Navigate to Interface06 when "Login" button is clicked
        val loginButton = findViewById<Button>(R.id.button5)
        loginButton.setOnClickListener {
            val intent = Intent(this, Interface06::class.java)
            startActivity(intent)
        }
    }
}
