package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }

                rollButton.setOnClickListener {
            val resultTextView = findViewById<TextView>(R.id.textView)
            resultTextView.text = "6"
        }


        private fun rollDice() {
            val dice = Dice(6)
            val diceRoll = dice.roll()
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = diceRoll.toString()



            class Dice(private val numSides: Int) {

                fun roll(): Int {
                    return (1..numSides).random()
                }

            }
        }


    }

    private fun rollDice()
        {
            // Create new Dice object with 6 sides and roll it
            val dice = Dice(6)
            val diceRoll = dice.roll()
            // Update the screen with the dice roll
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = diceRoll.toString()
        }
    }




class Dice(i: Int) {

    fun roll(): Int {
        return (1..i).random()
    }
}