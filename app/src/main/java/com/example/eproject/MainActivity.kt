package com.example.eproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val textView: TextView by lazy {findViewById<TextView>(R.id.textView)}
    val button: Button by lazy {findViewById<Button>(R.id.button)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = "Hello Peed"

        }
    }
}