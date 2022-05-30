package com.example.yogaguide

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var yogaImage: ImageView
    lateinit var yogaHeader: TextView
    lateinit var yogaText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val yogaButton1: ImageButton = findViewById(R.id.imagebutton1)
        yogaButton1.setOnClickListener {
            button1_action()
        }

        val yogaButton2: ImageButton = findViewById(R.id.imagebutton2)
        yogaButton2.setOnClickListener {
            button2_action()
        }

        val yogaButton3: ImageButton = findViewById(R.id.imagebutton3)
        yogaButton3.setOnClickListener {
            button3_action()
        }

        val yogaButton4: ImageButton = findViewById(R.id.imagebutton4)
        yogaButton4.setOnClickListener {
            button4_action()
        }

        val homeButton: Button = findViewById(R.id.home_button)
        homeButton.setOnClickListener {
            home_button_action()
        }

        yogaImage = findViewById(R.id.home_image)
        yogaHeader = findViewById(R.id.home_id)
        yogaText = findViewById(R.id.home_desc_id)
    }

    private fun button1_action() {
        yogaImage.setImageResource(R.drawable.padmasana_image)
        yogaHeader.text = getString(R.string.padmasana)
        yogaHeader.setTextColor(Color.DKGRAY)
        yogaText.text = getString(R.string.padmasana_text)
        yogaText.setTextColor(Color.GRAY)
    }

    private fun button2_action() {
        yogaImage.setImageResource(R.drawable.chakrasana_image)
        yogaHeader.text = getString(R.string.chakrasana)
        yogaHeader.setTextColor(Color.DKGRAY)
        yogaText.text = getString(R.string.chakrasana_text)
        yogaText.setTextColor(Color.GRAY)
    }

    private fun button3_action() {
        yogaImage.setImageResource(R.drawable.halasana_image)
        yogaHeader.text = getString(R.string.halasana)
        yogaHeader.setTextColor(Color.DKGRAY)
        yogaText.text = getString(R.string.halsana_text)
        yogaText.setTextColor(Color.GRAY)
    }

    private fun button4_action() {
        yogaImage.setImageResource(R.drawable.bhujangasana_image)
        yogaHeader.text = getString(R.string.bhujangasana)
        yogaHeader.setTextColor(Color.DKGRAY)
        yogaText.text = getString(R.string.bhujangasana_text)
        yogaText.setTextColor(Color.GRAY)
    }

    private fun home_button_action() {
        yogaImage.setImageResource(R.drawable.homescreen_image)
        yogaHeader.text = getString(R.string.home_header)
        yogaHeader.setTextColor(Color.rgb(0,121,107))
        yogaText.text = getString(R.string.home_desc)
        yogaText.setTextColor(Color.rgb(123,31,162))
    }

}
