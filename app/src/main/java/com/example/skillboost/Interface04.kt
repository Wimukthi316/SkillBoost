package com.example.skillboost

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Interface04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interface04)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Interface03 when back arrow is clicked
        val backArrow = findViewById<ImageView>(R.id.imageView35)
        backArrow.setOnClickListener {
            val intent = Intent(this, Interface03::class.java)
            startActivity(intent)
            finish() // Optional: Closes Interface04 when going back
        }

        // Navigate to Interface05 when "Create Account" button is clicked
        val createAccountButton = findViewById<Button>(R.id.button4)
        createAccountButton.setOnClickListener {
            val intent = Intent(this, Interface05::class.java)
            startActivity(intent)
        }
    }
}
