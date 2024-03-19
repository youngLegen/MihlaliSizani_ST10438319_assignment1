package com.example.myicetaskapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MuliplicationTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muliplication_table)

        //write a code here
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        multiplyButton.setOnClickListener {


        // create the explicit intent
        val intent = Intent(this, MultiplicationTable::class.java)

        // start the activity
            startActivity(intent)

            val multiplyButton = findViewById<Button>(R.id.multiplyButton)
            val tableNumberEditText =
                findViewById<EditText>(R.id.tableNumberEditText)
            multiplyButton.setOnClickListener {

            }
            // create the explicit intent
                val intent = Intent(this, MultiplicationTable::class.java)
                // add the table number to the intent
                intent.putExtra("tableNumber",
                    tableNumberEditText.text.toString())

                // start your next activity
                startActivity(intent



    }