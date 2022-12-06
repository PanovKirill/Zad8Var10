package com.example.kinopoiskpanov

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun perexod(view: View) {
        var log1 = findViewById<EditText>(R.id.Login)
        var pas1 = findViewById<EditText>(R.id.Password)
        if (log1.text.toString() == "" && pas1.text.toString() == "")
        {
            Toast.makeText(this, "Попробуйте снова", Toast.LENGTH_SHORT).show()
        }
        else
        {
            var intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }


    }
}