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
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button1.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button2.setOnClickListener {
            button2.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button2.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button3.setOnClickListener {
            button3.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button3.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button4.setOnClickListener {
            button4.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button4.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button5.setOnClickListener {
            button5.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button5.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button6.setOnClickListener {
            button6.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button6.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button7.setOnClickListener {
            button7.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button7.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button8.setOnClickListener {
            button8.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button8.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        }
        button9.setOnClickListener {
            button9.text = changeText
            changeText = if (changeText == "X") "O" else "X"
            testWinner(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
            button9.isEnabled = false
            testDraw(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
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
fun colored(colorButton1: Button , colorButton2: Button , colorButton3: Button , accText: TextView) {
    colorButton1.setBackgroundColor(Color.GREEN)
    colorButton2.setBackgroundColor(Color.GREEN)
    colorButton3.setBackgroundColor(Color.GREEN)
    accText.setBackgroundColor(Color.GREEN)
}
@SuppressLint("SetTextI18n")
fun testWinner(
    t_button1: Button, t_button2: Button,t_button3: Button,t_button4: Button,t_button5: Button ,
    t_button6: Button,t_button7: Button,t_button8: Button,t_button9: Button,accText: TextView
) {
    if (t_button1.text == t_button2.text && t_button2.text == t_button3.text ) {
        accText.text = "${t_button1.text} Winner"
        colored(t_button1,t_button2,t_button3,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button4.text == t_button5.text && t_button5.text == t_button6.text) {
        accText.text = "${t_button4.text} Winner"
        colored(t_button4,t_button5,t_button6,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button7.text == t_button8.text && t_button8.text == t_button9.text) {
        accText.text = "${t_button7.text} Winner"
        colored(t_button7,t_button8,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button1.text == t_button4.text && t_button4.text == t_button7.text) {
        accText.text = "${t_button1.text} Winner"
        colored(t_button1,t_button4,t_button7,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button2.text == t_button5.text && t_button5.text == t_button8.text) {
        accText.text = "${t_button2.text} Winner"
        colored(t_button2,t_button5,t_button8,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button3.text == t_button6.text && t_button6.text == t_button9.text) {
        accText.text = "${t_button3.text} Winner"
        colored(t_button3,t_button6,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button1.text == t_button5.text && t_button5.text == t_button9.text) {
        accText.text = "${t_button1.text} Winner"
        colored(t_button1,t_button5,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button3.text == t_button5.text && t_button5.text == t_button7.text) {
        accText.text = "${t_button3.text} Winner"
        colored(t_button3,t_button5,t_button7,accText)
    }
}
fun coloredDraw (
    t_button1: Button, t_button2: Button,t_button3: Button,t_button4: Button,t_button5: Button ,
    t_button6: Button,t_button7: Button,t_button8: Button,t_button9: Button,accText: TextView
) {
    val buttons = mutableListOf(
        t_button1,t_button2,t_button3,t_button4,t_button5,t_button6,t_button7,t_button8,t_button9
    )
    for (i in buttons.indices) {
        buttons[i].setBackgroundColor(Color.RED)
    }
    accText.setBackgroundColor(Color.RED)
}
@SuppressLint("SetTextI18n")
fun testDraw(
    t_button1: Button, t_button2: Button,t_button3: Button,t_button4: Button,t_button5: Button ,
    t_button6: Button,t_button7: Button,t_button8: Button,t_button9: Button,accText: TextView
) {
    if (
        t_button1.text != "1" && t_button2.text != "2" && t_button3.text != "3" &&
        t_button4.text != "4" && t_button5.text != "5" && t_button6.text != "6" &&
        t_button7.text != "7" && t_button8.text != "8" && t_button9.text != "9"
    ) {
        accText.text = "DRAW"
        coloredDraw(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9,accText
        )
    }
}
fun testFinish(
    t_button1: Button, t_button2: Button,t_button3: Button,t_button4: Button,t_button5: Button ,
    t_button6: Button,t_button7: Button,t_button8: Button,t_button9: Button
) {
    val buttons = mutableListOf(
        t_button1,t_button2,t_button3,t_button4,t_button5,t_button6,t_button7,t_button8,t_button9
    )
    for (i in buttons.indices) {
        buttons[i].isEnabled = false
    }
}
