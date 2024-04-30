package com.example.mypetsapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DogActivity : AppCompatActivity() {
    private lateinit var dogImageView: ImageView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanTextView: TextView
    private lateinit var happyTextView: TextView
    private var hungerLevel: Int = 5
    private var cleanLevel: Int = 5
    private var happyLevel: Int = 5

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)

        dogImageView = findViewById(R.id.dogImageView)
        hungerTextView = findViewById(R.id.hungerTextView)
        cleanTextView = findViewById(R.id.cleanTextView)
        happyTextView = findViewById(R.id.happyTextView)

        updateStatus()

        findViewById<Button>(R.id.feedButton).setOnClickListener {
            feedDog()
        }

        findViewById<Button>(R.id.playButton).setOnClickListener {
            playWithDog()
        }

        findViewById<Button>(R.id.cleanButton).setOnClickListener {
            cleanDog()
        }
    }

    private fun feedDog() {
        hungerLevel++
        updateStatus()
        dogImageView.setImageResource(R.drawable.img_3)
    }

    private fun playWithDog() {
        happyLevel++
        hungerLevel--
        updateStatus()
        dogImageView.setImageResource(R.drawable.img_5)
    }

    private fun cleanDog() {
        cleanLevel++
        updateStatus()
        dogImageView.setImageResource(R.drawable.img_4)
    }

    private fun updateStatus() {
        hungerTextView.text = "Hunger: $hungerLevel"
        cleanTextView.text = "Cleanliness: $cleanLevel"
        happyTextView.text = "Happiness: $happyLevel"
    }
}
