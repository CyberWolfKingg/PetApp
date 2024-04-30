package com.example.mypetsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mypetsapp.DogActivity
import com.example.mypetsapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onStartClicked(view: View) {
        val intent = Intent(this, DogActivity::class.java)
        startActivity(intent)
    }
}
