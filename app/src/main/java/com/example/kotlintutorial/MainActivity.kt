package com.example.kotlintutorial

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //View variables
    private var factTextView:TextView? = null
    private var showFactButton:Button? = null
//    private var relLayout:Layout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        factTextView = findViewById(R.id.fact)
        showFactButton = findViewById(R.id.showOtherFactBTN)

        showFactButton!!.setOnClickListener{
            factTextView!!.text = "Ostriches can run faster than horses."
        }

    }
}
