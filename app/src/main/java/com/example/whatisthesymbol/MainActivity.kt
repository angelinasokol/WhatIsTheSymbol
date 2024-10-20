package com.example.whatisthesymbol

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handing : TextView = findViewById(R. id.handing)
        val button : Button = findViewById(R. id.button)
        val inputSymbol : EditText = findViewById(R. id.inputSymbol)
        button.setOnClickListener{
            val charInput = inputSymbol.text.toString()
            if (charInput.length == 1) {
                val char = charInput[0]
            }
            }
        }
            }
        }
