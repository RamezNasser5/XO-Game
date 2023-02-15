package com.example.xogame

import android.annotation.SuppressLint
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
            }
            else if (button1.text == "X" && button4.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button1.text == "X" && button5.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button1.text == "O" && button2.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button1.text == "O" && button4.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button1.text == "O" && button5.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button2.setOnClickListener {
            button2.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button1.text == "X" && button2.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button2.text == "X" && button5.text == "X" && button8.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button1.text == "O" && button2.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button2.text == "O" && button5.text == "O" && button8.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button3.setOnClickListener {
            button3.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button1.text == "X" && button2.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button3.text == "X" && button6.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button3.text == "X" && button5.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button1.text == "O" && button2.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button3.text == "O" && button6.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button3.text == "O" && button5.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button4.setOnClickListener {
            button4.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button1.text == "X" && button4.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button4.text == "X" && button5.text == "X" && button6.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button1.text == "O" && button4.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button4.text == "O" && button5.text == "O" && button6.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button5.setOnClickListener {
            button5.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button5.text == "X" && button6.text == "X" && button4.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button5.text == "X" && button8.text == "X" && button2.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button5.text == "X" && button3.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button5.text == "X" && button9.text == "X" && button1.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button5.text == "O" && button6.text == "O" && button4.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button5.text == "O" && button8.text == "O" && button2.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button5.text == "O" && button3.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button5.text == "O" && button9.text == "O" && button1.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button6.setOnClickListener {
            button6.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button3.text == "X" && button6.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button4.text == "X" && button5.text == "X" && button6.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button3.text == "O" && button6.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button4.text == "O" && button5.text == "O" && button6.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button7.setOnClickListener {
            button7.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button7.text == "X" && button8.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button7.text == "X" && button4.text == "X" && button1.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button7.text == "X" && button5.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button7.text == "O" && button8.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button7.text == "O" && button4.text == "O" && button1.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button7.text == "O" && button5.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button8.setOnClickListener {
            button8.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button8.text == "X" && button5.text == "X" && button2.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button7.text == "X" && button8.text == "X" && button9.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button8.text == "O" && button5.text == "O" && button2.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button7.text == "O" && button8.text == "O" && button9.text == "O" ) {
                accText.text = "O Accepted"
            }
        }
        button9.setOnClickListener {
            button9.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            if (button9.text == "X" && button6.text == "X" && button3.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button9.text == "X" && button8.text == "X" && button7.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button9.text == "X" && button5.text == "X" && button1.text == "X" ) {
                accText.text = "X Accepted"
            }
            else if (button9.text == "O" && button6.text == "O" && button3.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button9.text == "O" && button8.text == "O" && button7.text == "O" ) {
                accText.text = "O Accepted"
            }
            else if (button9.text == "O" && button5.text == "O" && button1.text == "O" ) {
                accText.text = "O Accepted"
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
