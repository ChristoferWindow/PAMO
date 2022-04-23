package com.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.Quiz;
import com.example.bmicalculator.BmiCalculator;
import com.example.bmicalculator.BmiLinearChart;
import com.example.bmicalculator.R;
import com.example.calorie.CalorieRecommendation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bmiCalculatorLink = (Button) findViewById(R.id.nav_bmi_calculaor);
        Button calorieRecommendationLink = (Button) findViewById(R.id.nav_calorie_calculator);
        Button bmiLinearChart = (Button) findViewById(R.id.nav_bmi_chart);
        Button quiz = (Button) findViewById(R.id.nav_quiz);


        bmiCalculatorLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchBmiActivity();
            }
        });

        calorieRecommendationLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchCalorieActivity();
            }
        });

        bmiLinearChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchBmiChartActivity();
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchQuizActivity();
            }
        });

    }

    private void launchQuizActivity() {
        Log.i("message","Launching Quiz");
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

    private void launchBmiActivity() {
        Log.i("message","Launching BMI");
        Intent intent = new Intent(this, BmiCalculator.class);
        startActivity(intent);
    }


    private void launchCalorieActivity() {
        Log.i("message","Launching Calorie");
        Intent intent = new Intent(this, CalorieRecommendation.class);
        startActivity(intent);
    }

    private void launchBmiChartActivity() {
        Log.i("message","Launching BMI chart");
        Intent intent = new Intent(this, BmiLinearChart.class);
        startActivity(intent);
    }


}