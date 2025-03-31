package com.example.skillboost

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Interface03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interface03)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Interface04 when "NEXT" button is clicked
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(this, Interface04::class.java)
            startActivity(intent)
        }

        // Navigate to Interface02 when back arrow is clicked
        val backArrow = findViewById<ImageView>(R.id.imageView25)
        backArrow.setOnClickListener {
            val intent = Intent(this, Interface02::class.java)
            startActivity(intent)
            finish() // Optional: Closes Interface03 when going back
        }
    }
}
