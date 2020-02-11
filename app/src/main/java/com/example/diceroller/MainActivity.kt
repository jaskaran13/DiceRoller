package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollbutton:Button=findViewById(R.id.roll_button)
        rollbutton.text="Lets roll"
        rollbutton.setOnClickListener {

            rollDice()
        }
    }

    private fun rollDice() {

        //val resultText:TextView=findViewById(R.id.result_text)
        var randomInt=java.util.Random().nextInt(6)+1

        var draw=when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }

        var randomImage:ImageView=findViewById(R.id.dice_image)
        randomImage.setImageResource(draw)
        //resultText.text=randomInt.toString()
    }
}
