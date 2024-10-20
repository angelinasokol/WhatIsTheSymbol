package com.example.whatisthesymbol

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handing: TextView = findViewById(R.id.handing)
        val button: Button = findViewById(R.id.button)
        val inputSymbol: EditText = findViewById(R.id.inputSymbol)

        button.setOnClickListener {
            val symbolInput = inputSymbol.text.toString()
            if (symbolInput.length == 1) {
                val symbol = symbolInput[0]

                if (symbol.isDigit()) {
                    handing.text = "Это цифра!"
                } else if (symbol in setOf('&', '#', '<', '–')) {
                    handing.text = "Это специальный символ!"
                } else {
                    handing.text = "Непредусмотренный вариант!"
                }
            } else {
                handing.text = "Ошибка: введите один символ"
            }
        }
    }
}
