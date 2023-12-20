package com.ex.finalprojectasia

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private val database = FirebaseDatabase.getInstance()
    private val databaseReference = database.reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countdownButton = findViewById<Button>(R.id.Countdown)
        countdownButton.setOnClickListener {

            val dataToStore = hashMapOf(
                "buttonClicked" to true,
                "timestamp" to System.currentTimeMillis()

            )


            databaseReference.child("Countdown")

                .push()
                .setValue("Countdown true")
                .addOnSuccessListener {

                }
                .addOnFailureListener { e ->

                }
        }



        val countButton = findViewById<Button>(R.id.Count)
        countButton.setOnClickListener {

            val dataToStore = hashMapOf(
                "buttonClicked" to true,
                "timestamp" to System.currentTimeMillis()

            )


            databaseReference.child("Count")

                .push()
                .setValue("Count true")
                .addOnSuccessListener {

                }
                .addOnFailureListener { e ->

                }
        }


        val helloButton = findViewById<Button>(R.id.Helloworld)
        helloButton.setOnClickListener {

            val dataToStore = hashMapOf(
                "buttonClicked" to true,
                "timestamp" to System.currentTimeMillis()

            )


            databaseReference.child("Hello World")

                .push()
                .setValue("Hello World true")
                .addOnSuccessListener {

                }
                .addOnFailureListener { e ->

                }
        }
    }
}
