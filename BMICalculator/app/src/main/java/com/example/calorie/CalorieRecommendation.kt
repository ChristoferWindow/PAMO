package com.example.calorie

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.os.Bundle
import android.view.View
import com.example.bmicalculator.R
import android.widget.ArrayAdapter
import kotlin.jvm.internal.Intrinsics

class CalorieRecommendation : AppCompatActivity() {
    private var height: EditText? = null
    private var weight: EditText? = null
    private var age: EditText? = null
    private var gender: Spinner? = null
    private var result: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calorie_recommendation)
        val spinner = findViewById<View>(R.id.gender) as Spinner
        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.spinner, android.R.layout.simple_spinner_item
        )
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        spinner.adapter = adapter
        height = findViewById<View>(R.id.height) as EditText
        weight = findViewById<View>(R.id.weight) as EditText
        age = findViewById<View>(R.id.age) as EditText
        gender = findViewById<View>(R.id.gender) as Spinner
        result = findViewById<View>(R.id.result) as TextView
    }

    fun calculateCalories(v: View) {
        var calorie = 0.0
        calorie = if (gender!!.selectedItem.toString() == "Female") {
            655.1 + 9.563 * weight!!.text.toString().toFloat() + 1.85 * height!!.text.toString()
                .toFloat() - 4.676 * age!!.text.toString().toFloat()
        } else {
            66.5 + 13.75 * weight!!.text.toString().toFloat() + 5.003 * height!!.text.toString()
                .toFloat() - 6.775 * age!!.text.toString().toFloat()
        }
        displayText(calorie)
    }

    private fun displayText(calories: Double) {
        val bmiLabel = calories.toString() + ""
        val result = result
        Intrinsics.checkNotNull(result)
        result!!.text = bmiLabel
    }
}