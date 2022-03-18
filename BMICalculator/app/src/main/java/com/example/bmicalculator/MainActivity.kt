package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var height: EditText? = null
    private var weight: EditText? = null
    private var result: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        height = findViewById(R.id.height)
        weight = findViewById(R.id.weight)
        result = findViewById<EditText>(R.id.result)
    }

    fun calculateBMI(v: View) {
        val heightStr = v.height.toString()
        val weightStr = v.height.toString()

        if ("" != heightStr && "" != weightStr) {
            val heightValue: Float = heightStr.toFloat() / 100
            val weightValue: Float = weightStr.toFloat()
            val bmi = weightValue / (heightValue * heightValue)
            displayBMI(bmi)
        }
    }

    private fun displayBMI(bmi: Float) {
        val bmiLabel = bmi.toString() + ""
        result!!.text = bmiLabel
    }
}