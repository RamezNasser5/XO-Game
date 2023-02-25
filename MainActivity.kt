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
        setListener(button1,button2,button3,button4,button5,button6,button7,button8,button9,accText)
        val restart: Button = findViewById(R.id.restart)
        restart.setOnClickListener {
            finish()
            startActivity(intent)
            overridePendingTransition(0,1)
            Toast.makeText(this, "current ${System.currentTimeMillis()}", Toast.LENGTH_SHORT).show()
        }
    }
    private fun setListener(
        t_button1: Button,t_button2: Button,t_button3: Button,t_button4: Button,
        t_button5: Button,t_button6: Button,t_button7: Button,t_button8: Button,
        t_button9: Button,accText: TextView
    ) {
       val buttons = mutableListOf(
           t_button1,t_button2,t_button3,t_button4,t_button5,t_button6,t_button7,t_button8,t_button9
       )
        var changeText = "X"
        var checkComplete = 0
        for (item in buttons) {
            item.setOnClickListener {
                checkComplete++
                item.text = changeText
                changeText = if (changeText == "X") "O" else "X"
                testWinner(
                    t_button1,t_button2,t_button3,t_button4,t_button5,
                    t_button6, t_button7,t_button8,t_button9,accText,item
                )
                item.isEnabled = false
                testDraw(
                    t_button1,t_button2,t_button3,t_button4,t_button5,t_button6,
                    t_button7,t_button8,t_button9,accText,checkComplete
                )
            }
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
    t_button6: Button,t_button7: Button,t_button8: Button,t_button9: Button,
    accText: TextView,item: Button
) {
    if (t_button1.text == "X" && t_button2.text == "X" && t_button3.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button1,t_button2,t_button3,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )
    }
    else if (t_button1.text == "O" && t_button2.text == "O" && t_button3.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button1,t_button2,t_button3,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

    }
    else if (t_button4.text == "X" && t_button5.text == "X" && t_button6.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button4,t_button5,t_button6,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )

    }
    else if (t_button4.text == "O" && t_button5.text == "O" && t_button6.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button4,t_button5,t_button6,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

    }
    else if (t_button7.text == "X" && t_button8.text == "X" && t_button9.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button7,t_button8,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )

    }
    else if (t_button7.text == "O" && t_button8.text == "O" && t_button9.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button7,t_button8,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

    }
    else if (t_button1.text == "X" && t_button4.text == "X" && t_button7.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button1,t_button4,t_button7,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )

    }
    else if (t_button1.text == "O" && t_button4.text == "O" && t_button7.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button1,t_button4,t_button7,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

    }
    else if (t_button2.text == "X" && t_button5.text == "X" && t_button8.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button2,t_button5,t_button8,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )

    }
    else if (t_button2.text == "O" && t_button5.text == "O" && t_button8.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button2,t_button5,t_button8,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

    }
    else if (t_button3.text == "X" && t_button6.text == "X" && t_button9.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button3,t_button6,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )

    }
    else if (t_button3.text == "O" && t_button6.text == "O" && t_button9.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button3,t_button6,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

    }
    else if (t_button1.text == "X" && t_button5.text == "X" && t_button9.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button1,t_button5,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )

    }
    else if (t_button1.text == "O" && t_button5.text == "O" && t_button9.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button1,t_button5,t_button9,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

    }
    else if (t_button3.text == "X" && t_button5.text == "X" && t_button7.text == "X") {
        accText.text = "${item.text} Winner"
        colored(t_button3,t_button5,t_button7,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9
        )

    }
    else if (t_button3.text == "O" && t_button5.text == "O" && t_button7.text == "O") {
        accText.text = "${item.text} Winner"
        colored(t_button3,t_button5,t_button7,accText)
        testFinish(
            t_button1, t_button2,t_button3,t_button4,t_button5 , t_button6,t_button7,t_button8,t_button9)

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
    t_button1: Button, t_button2: Button,t_button3: Button,t_button4: Button,
    t_button5: Button , t_button6: Button,t_button7: Button,t_button8: Button,
    t_button9: Button,accText: TextView,checkComplete: Int
) {
    if (checkComplete == 9) {
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
