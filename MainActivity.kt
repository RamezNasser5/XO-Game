package com.example.xogame

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var changeText = "X"
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val accText: TextView = findViewById(R.id.accepted_id)
        button1.setOnClickListener {
            button1.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button1.text == "X" && button2.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
                colored(button1,button2,button3)
            }
            else if (button1.text == "X" && button4.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
                colored(button1,button4,button7)
            }
            else if (button1.text == "X" && button5.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
                colored(button1,button5,button9)
            }
            else if (button1.text == "O" && button2.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
                colored(button1,button2,button3)
            }
            else if (button1.text == "O" && button4.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
                colored(button1,button4,button7)
            }
            else if (button1.text == "O" && button5.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button5,button1)
            }
        }
        button2.setOnClickListener {
            button2.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button1.text == "X" && button2.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
                colored(button3,button2,button1)
            }
            else if (button2.text == "X" && button5.text == "X" && button8.text == "X" ) {
                accText.text = "X Accepted"
                colored(button2,button5,button8)
            }
            else if (button1.text == "O" && button2.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
                colored(button1,button3,button2)
            }
            else if (button2.text == "O" && button5.text == "O" && button8.text == "O" ) {
                accText.text = "O Accepted"
                colored(button2,button5,button8)
            }
        }
        button3.setOnClickListener {
            button3.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button1.text == "X" && button2.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
                colored(button3,button2,button1)
            }
            else if (button3.text == "X" && button6.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button6,button3)
            }
            else if (button3.text == "X" && button5.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
                colored(button7,button5,button3)
            }
            else if (button1.text == "O" && button2.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
                colored(button1,button2,button3)
            }
            else if (button3.text == "O" && button6.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button6,button3)
            }
            else if (button3.text == "O" && button5.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
                colored(button7,button5,button3)
            }
        }
        button4.setOnClickListener {
            button4.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button1.text == "X" && button4.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
                colored(button1,button4,button7)
            }
            else if (button4.text == "X" && button5.text == "X" && button6.text == "X" ) {
                accText.text = "X Accepted"
                colored(button4,button5,button6)
            }
            else if (button1.text == "O" && button4.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
                colored(button1,button4,button7)
            }
            else if (button4.text == "O" && button5.text == "O" && button6.text == "O" ) {
                accText.text = "O Accepted"
                colored(button6,button5,button4)
            }
        }
        button5.setOnClickListener {
            button5.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button5.text == "X" && button6.text == "X" && button4.text == "X" ) {
                accText.text = "X Accepted"
                colored(button6,button5,button4)
            }
            else if (button5.text == "X" && button8.text == "X" && button2.text == "X" ) {
                accText.text = "X Accepted"
                colored(button2,button5,button8)
            }
            else if (button5.text == "X" && button3.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
                colored(button3,button5,button7)
            }
            else if (button5.text == "X" && button9.text == "X" && button1.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button5,button1)
            }
            else if (button5.text == "O" && button6.text == "O" && button4.text == "O" ) {
                accText.text = "O Accepted"
                colored(button6,button5,button4)
            }
            else if (button5.text == "O" && button8.text == "O" && button2.text == "O" ) {
                accText.text = "O Accepted"
                colored(button8,button5,button2)
            }
            else if (button5.text == "O" && button3.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
                colored(button7,button5,button3)
            }
            else if (button5.text == "O" && button9.text == "O" && button1.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button5,button1)
            }
        }
        button6.setOnClickListener {
            button6.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button3.text == "X" && button6.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button3,button6)
            }
            else if (button4.text == "X" && button5.text == "X" && button6.text == "X" ) {
                accText.text = "X Accepted"
                colored(button6,button5,button4)
            }
            else if (button3.text == "O" && button6.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button3,button6)
            }
            else if (button4.text == "O" && button5.text == "O" && button6.text == "O" ) {
                accText.text = "O Accepted"
                colored(button4,button5,button6)
            }
        }
        button7.setOnClickListener {
            button7.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button7.text == "X" && button8.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button8,button7)
            }
            else if (button7.text == "X" && button4.text == "X" && button1.text == "X" ) {
                accText.text = "X Accepted"
                colored(button4,button7,button1)
            }
            else if (button7.text == "X" && button5.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
                colored(button7,button5,button3)
            }
            else if (button7.text == "O" && button8.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button8,button7)
            }
            else if (button7.text == "O" && button4.text == "O" && button1.text == "O" ) {
                accText.text = "O Accepted"
                colored(button4,button7,button1)
            }
            else if (button7.text == "O" && button5.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
                colored(button7,button5,button3)
            }
        }
        button8.setOnClickListener {
            button8.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button8.text == "X" && button5.text == "X" && button2.text == "X" ) {
                accText.text = "X Accepted"
                colored(button8,button5,button2)
            }
            else if (button7.text == "X" && button8.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button7,button8)
            }
            else if (button8.text == "O" && button5.text == "O" && button2.text == "O" ) {
                accText.text = "O Accepted"
                colored(button8,button5,button2)
            }
            else if (button7.text == "O" && button8.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button7,button8)
            }
        }
        button9.setOnClickListener {
            button9.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button9.text == "X" && button6.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button6,button3)
            }
            else if (button9.text == "X" && button8.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button8,button7)
            }
            else if (button9.text == "X" && button5.text == "X" && button1.text == "X" ) {
                accText.text = "X Accepted"
                colored(button9,button5,button1)
            }
            else if (button9.text == "O" && button6.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button6,button3)
            }
            else if (button9.text == "O" && button8.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button8,button7)
            }
            else if (button9.text == "O" && button5.text == "O" && button1.text == "O" ) {
                accText.text = "O Accepted"
                colored(button9,button5,button1)
            }
        }
        val restart: Button = findViewById(R.id.restart)
        restart.setOnClickListener {
            finish()
            startActivity(intent)
            overridePendingTransition(0,1)
            Toast.makeText(this, "current ${System.currentTimeMillis()}", Toast.LENGTH_SHORT).show()
        }
    }
}
fun colored(colorButton1: Button , colorButton2: Button , colorButton3: Button) {
    colorButton1.setBackgroundColor(Color.GREEN)
    colorButton2.setBackgroundColor(Color.GREEN)
    colorButton3.setBackgroundColor(Color.GREEN)
}
