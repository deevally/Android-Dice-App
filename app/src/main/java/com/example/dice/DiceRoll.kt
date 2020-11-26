package com.example.dice

import android.widget.TextView

class Dice(val numSizes : Int) {
    fun roll(): Int {
        return (1..numSizes).random()
    }
}

