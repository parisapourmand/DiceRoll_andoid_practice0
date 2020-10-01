package com.example.thefirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceTxt : TextView
    lateinit var diceImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btn_roll)
        diceTxt = findViewById(R.id.dice_txt)
        diceImg = findViewById(R.id.dice_img)
        btnRoll.setOnClickListener{
            rollDice()
            Toast.makeText(this,"You have clicked the button!", Toast.LENGTH_SHORT).show()
        }
    }
    private fun rollDice(){
//        generate random number
        val randNumber = Random.nextInt(6) + 1
        diceTxt.text = randNumber.toString()
        val dice = when(randNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(dice)


    }
}