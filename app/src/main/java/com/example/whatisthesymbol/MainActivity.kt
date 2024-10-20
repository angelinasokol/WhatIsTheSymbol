package com.example.whatisthesymbol

import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
        val handler = Handler(Looper.getMainLooper())

        button.setOnClickListener {
            val symbolInput = inputSymbol.text.toString()
            if (symbolInput.length == 1) {
                val symbol = symbolInput[0]

                handing.text = "Проверяем, является ли символ цифрой..."
                handler.postDelayed({
                    if (symbol.isDigit()) {
                        handing.text = "Это цифра!"
                    } else {
                        handing.text = "Символ не является цифрой. Проверяем, является ли он специальным символом..."


                        handler.postDelayed({
                            if (symbol in setOf('&', '#', '<', '–')) {
                                handing.text = "Это специальный символ!"
                            } else {
                                handing.text = "Символ не является специальным. Непредусмотренный вариант!"
                            }
                        }, 1000) // 1000 миллисекунд = 1 секунда
                    }
                }, 1000) // 1000 миллисекунд = 1 секунда
            } else {
                handing.text = "Ошибка: введите один символ"
            }
        }
    }
}
