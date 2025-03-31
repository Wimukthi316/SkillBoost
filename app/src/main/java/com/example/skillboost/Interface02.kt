package com.example.skillboost

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Interface02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interface02)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Interface03 when NEXT button is clicked
        val nextButton = findViewById<Button>(R.id.button3)
        nextButton.setOnClickListener {
            val intent = Intent(this, Interface03::class.java)
            startActivity(intent)
        }

        // Navigate to Interface01 when back arrow is clicked
        val backArrow = findViewById<ImageView>(R.id.imageView25)
        backArrow.setOnClickListener {
            val intent = Intent(this, Interface01::class.java)
            startActivity(intent)
            finish() // Optional: Closes Interface02 when going back
        }
    }
}
