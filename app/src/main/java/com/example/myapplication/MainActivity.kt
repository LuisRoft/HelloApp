package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.showButton)

        val input1 = findViewById<EditText>(R.id.inputText)
        button.setOnClickListener {
            showName("Hello: ${input1.text}!")
        }
    }
    fun showName(s: String){
        val txt = findViewById<TextView>(R.id.textView)
        txt.text = s
    }
}