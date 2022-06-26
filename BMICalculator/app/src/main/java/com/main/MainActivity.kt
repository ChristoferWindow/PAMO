package com.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bmicalculator.R
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.Quiz
import com.example.bmicalculator.BmiCalculator
import com.example.calorie.CalorieRecommendation
import com.example.bmicalculator.BmiLinearChart

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bmiCalculatorLink = findViewById<View>(R.id.nav_bmi_calculaor) as Button
        val calorieRecommendationLink = findViewById<View>(R.id.nav_calorie_calculator) as Button
        val bmiLinearChart = findViewById<View>(R.id.nav_bmi_chart) as Button
        val quiz = findViewById<View>(R.id.nav_quiz) as Button
        bmiCalculatorLink.setOnClickListener { launchBmiActivity() }
        calorieRecommendationLink.setOnClickListener { launchCalorieActivity() }
        bmiLinearChart.setOnClickListener { launchBmiChartActivity() }
        quiz.setOnClickListener { launchQuizActivity() }
    }

    private fun launchQuizActivity() {
        Log.i("message", "Launching Quiz")
        val intent = Intent(this, Quiz::class.java)
        startActivity(intent)
    }

    private fun launchBmiActivity() {
        Log.i("message", "Launching BMI")
        val intent = Intent(this, BmiCalculator::class.java)
        startActivity(intent)
    }

    private fun launchCalorieActivity() {
        Log.i("message", "Launching Calorie")
        val intent = Intent(this, CalorieRecommendation::class.java)
        startActivity(intent)
    }

    private fun launchBmiChartActivity() {
        Log.i("message", "Launching BMI chart")
        val intent = Intent(this, BmiLinearChart::class.java)
        startActivity(intent)
    }
}