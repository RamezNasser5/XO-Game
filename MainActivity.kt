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
        val buttons = mutableListOf<Button>(
            findViewById(R.id.button1),findViewById(R.id.button2),findViewById(R.id.button3),
            findViewById(R.id.button4),findViewById(R.id.button5),findViewById(R.id.button6),
            findViewById(R.id.button7),findViewById(R.id.button8),findViewById(R.id.button9)
        )
        val accText: TextView = findViewById(R.id.accepted_id)
        setListener(buttons,accText)
        val restart: Button = findViewById(R.id.restart)
        restart.setOnClickListener {
            finish()
            startActivity(intent)
            overridePendingTransition(0,1)
            Toast.makeText(this, "replay successfully", Toast.LENGTH_SHORT).show()
        }
    }
    private fun setListener(
        buttons:List<Button>,accText: TextView
    ) {
        var changeText = "X"
        var checkComplete = 0
        for (item in buttons) {
            item.setOnClickListener {
                checkComplete++
                item.text = changeText
                changeText = if (changeText == "X") "O" else "X"
                testWinner(buttons,accText,item)
                item.isEnabled = false
                testDraw(buttons,accText,checkComplete,item)
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
fun testWinner(buttons: List<Button>, accText: TextView, item: Button): Boolean {
    if (buttons[0].text == "X" && buttons[1].text == "X" && buttons[2].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[1],buttons[2],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[0].text == "O" && buttons[1].text == "O" && buttons[2].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[1],buttons[2],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[3].text == "X" && buttons[4].text == "X" && buttons[5].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[3],buttons[4],buttons[5],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[3].text == "O" && buttons[4].text == "O" && buttons[5].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[3],buttons[4],buttons[5],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[6].text == "X" && buttons[7].text == "X" && buttons[8].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[6],buttons[7],buttons[8],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[6].text == "O" && buttons[7].text == "O" && buttons[8].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[6],buttons[7],buttons[8],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[0].text == "X" && buttons[3].text == "X" && buttons[6].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[3],buttons[6],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[0].text == "O" && buttons[3].text == "O" && buttons[6].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[3],buttons[6],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[0].text == "X" && buttons[3].text == "X" && buttons[6].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[3],buttons[6],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[0].text == "O" && buttons[3].text == "O" && buttons[6].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[3],buttons[6],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[2].text == "X" && buttons[5].text == "X" && buttons[7].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[2],buttons[5],buttons[7],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[2].text == "O" && buttons[5].text == "O" && buttons[7].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[2],buttons[5],buttons[7],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[0].text == "X" && buttons[4].text == "X" && buttons[8].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[4],buttons[8],accText)
        testFinish(
           buttons
        )
        return true
    }
    else if (buttons[0].text == "O" && buttons[4].text == "O" && buttons[8].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[0],buttons[4],buttons[8],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[2].text == "X" && buttons[4].text == "X" && buttons[6].text == "X") {
        accText.text = "${item.text} Winner"
        colored(buttons[2],buttons[4],buttons[6],accText)
        testFinish(buttons)
        return true
    }
    else if (buttons[2].text == "O" && buttons[4].text == "O" && buttons[6].text == "O") {
        accText.text = "${item.text} Winner"
        colored(buttons[2],buttons[4],buttons[6],accText)
        testFinish(buttons)
        return true
    }
    return false
}
fun coloredDraw (
    buttons: List<Button>,accText: TextView
) {
    for (i in buttons.indices) {
        buttons[i].setBackgroundColor(Color.RED)
    }
    accText.setBackgroundColor(Color.RED)
}
@SuppressLint("SetTextI18n")
fun testDraw(
    buttons: List<Button>,accText: TextView,checkComplete: Int,item: Button
) {
    if (checkComplete == 9) {
        if (testWinner(buttons,accText,item)) {
            testWinner(buttons,accText,item)
        }
        else {
        accText.text = "DRAW"
        coloredDraw(buttons,accText)
        }
    }
}
fun testFinish(buttons: List<Button>) {
    for (i in buttons.indices) {
        buttons[i].isEnabled = false
    }
}
