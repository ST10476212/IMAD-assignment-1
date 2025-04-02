package vcmsa.ci.imadassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // find the Textview by Id
        val textview1 = findViewById<TextView>(R.id.answer1)

        // find the Button by Id
        val button1 = findViewById<Button>(R.id.start)

        // find the Button by Id
        val button2 = findViewById<Button>(R.id.reset2)

        // find the Edit text by Id
        val editText = findViewById<EditText>(R.id.inputdate1)

        // find the Textview by Id
        val textView2 = findViewById<TextView>(R.id.textView2)

        button1.setOnClickListener{
            val text = editText.text.toString()

            if (text == "Morning" || text == "morning"){
                textview1.text = "eat eggs"

            }else if (text == "Midmorning"|| text == "midmorning"){
                textview1.text = "eat chicken sandwhich"

            }else if (text == "afternoon"|| text =="afternoon"){
                textview1.text = "eat rice and vegetables"

            }else if (text == "Midafternoon"|| text =="midafternoon"){
                textview1.text = "eat fruits"

            }else if (text == "Dinner"|| text =="dinner")
                textview1.text = "eat steak"

            // Title: Meal suggestion app
            // Author: w3schools
            // Date: 31 March 2025
            // Version: 1.0
            // Available: https://www.w3schools.com/kotlin/kotlin_conditions.php


                }
        button2.setOnClickListener{
            editText.text.clear()
            textview1.text = "Enter new data"


            }

        }
    }


