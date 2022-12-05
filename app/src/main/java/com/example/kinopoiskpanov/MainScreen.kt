package com.example.kinopoiskpanov

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun perexod2(view: View) {
        var intent = Intent(this,MainScreen::class.java)
        startActivity(intent)
    }
}