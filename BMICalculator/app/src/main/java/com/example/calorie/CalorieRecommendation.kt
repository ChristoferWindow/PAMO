package com.example.calorie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.bmicalculator.R;

import org.jetbrains.annotations.NotNull;

import kotlin.jvm.internal.Intrinsics;

public class CalorieRecommendation extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private EditText age;
    private Spinner gender;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_recommendation);

        Spinner spinner = (Spinner) findViewById(R.id.gender);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        this.height = (EditText) this.findViewById(R.id.height);
        this.weight = (EditText) this.findViewById(R.id.weight);
        this.age = (EditText) this.findViewById(R.id.age);
        this.gender = (Spinner) this.findViewById(R.id.gender);
        this.result = (TextView) this.findViewById(R.id.result);
    }

    public final void calculateCalories(@NotNull View v) {
        Double calorie = 0.0;
        if (this.gender.getSelectedItem().toString().equals("Female")) {
            calorie = 655.1 + (9.563 * Float.parseFloat(weight.getText().toString()))+(1.85 * Float.parseFloat(height.getText().toString()))-(4.676 * Float.parseFloat(age.getText().toString()));
        } else {
            calorie = 66.5 + (13.75 * Float.parseFloat(weight.getText().toString()))+(5.003 * Float.parseFloat(height.getText().toString()))-(6.775 * Float.parseFloat(age.getText().toString()));
        }
        this.displayText(calorie);
    }

    private void displayText(Double calories) {
        String bmiLabel = calories + "";
        TextView result = this.result;
        Intrinsics.checkNotNull(result);
        result.setText(bmiLabel);
    }
}