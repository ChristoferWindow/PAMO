package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.view.View
import com.example.bmicalculator.R
import kotlin.jvm.internal.Intrinsics

class BmiCalculator : AppCompatActivity() {
    private var height: EditText? = null
    private var weight: EditText? = null
    private var result: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_bmi_calculator)
        height = findViewById<View>(R.id.height) as EditText
        weight = findViewById<View>(R.id.weight) as EditText
        result = findViewById<View>(R.id.result) as TextView
    }

    fun calculateBMI(v: View) {
        val heightStr = height!!.text.toString()
        val weightStr = weight!!.text.toString()
        if ("" != heightStr && "" != weightStr) {
            val heightValue = heightStr.toFloat() / 100.toFloat()
            val weightValue = weightStr.toFloat()
            val bmi = weightValue / (heightValue * heightValue)
            displayBMI(bmi)
        }
    }

    private fun displayBMI(bmi: Float) {
        val bmiLabel = bmi.toString() + ""
        val result = result
        Intrinsics.checkNotNull(result)
        result!!.text = bmiLabel
    }
}