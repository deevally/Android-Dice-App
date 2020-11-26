package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        //Create lucky Number
        val luckyNum : Int = 6
        val num = (1..luckyNum).random()

        var luckyText : TextView =  findViewById(R.id.textView4);
        luckyText.text = num.toString()

        // Create new Dice object with 6 sides and roll it

        val dice = Dice(6)
        val dice2 = Dice(6)
        val rollDice = dice.roll()
        val rollDice2 =  dice2.roll()

        //Get the imageViews
        var diceImage1: ImageView = findViewById(R.id.imageView);
        var diceImage2: ImageView = findViewById(R.id.imageView2);
        // Update the screen with the dice roll


//           if( rollDice == num ){
//               Toast.makeText(this,"Winner One", Toast.LENGTH_SHORT).show()
//           }
        if(rollDice == rollDice2){
            Toast.makeText(this,"Play Again", Toast.LENGTH_SHORT).show()
        }

        when(num){
                rollDice -> Toast.makeText(this,"Winner One", Toast.LENGTH_SHORT).show()
                rollDice2 -> Toast.makeText(this,"Winner Two", Toast.LENGTH_SHORT).show()
        }

//        when(rollDice){
//            1 -> diceImage1.setImageResource(R.drawable.dice_1)
//            2 -> diceImage1.setImageResource(R.drawable.dice_2)
//            3 -> diceImage1.setImageResource(R.drawable.dice_3)
//            4 -> diceImage1.setImageResource(R.drawable.dice_4)
//            5 -> diceImage1.setImageResource(R.drawable.dice_5)
//            6 -> diceImage1.setImageResource(R.drawable.dice_6)
//        }



        val drawableResource = when (rollDice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage1.setImageResource(drawableResource)

        val drawableResource2 = when (rollDice2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage2.setImageResource(drawableResource2)
    }
}
