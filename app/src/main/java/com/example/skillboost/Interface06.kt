package com.example.skillboost

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Interface06 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interface06)

        // Handle window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Interface09 when imageView10 is clicked
        val imageView10 = findViewById<ImageView>(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent = Intent(this, Interface09::class.java)
            startActivity(intent)
        }

        // Other ImageView click listeners remain unchanged
        val imageView11 = findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            val intent = Intent(this, Interface07::class.java)
            startActivity(intent)
        }

        val imageView12 = findViewById<ImageView>(R.id.imageView12)
        imageView12.setOnClickListener {
            val intent = Intent(this, Interface08::class.java)
            startActivity(intent)
        }

        val imageView13 = findViewById<ImageView>(R.id.imageView13)
        imageView13.setOnClickListener {
            val intent = Intent(this, Interface08::class.java)
            startActivity(intent)
        }

        val imageView14 = findViewById<ImageView>(R.id.imageView14)
        imageView14.setOnClickListener {
            val intent = Intent(this, Interface07::class.java)
            startActivity(intent)
        }
    }
}
