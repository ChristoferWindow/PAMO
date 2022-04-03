package com.example.calorie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.bmicalculator.R;

public class CalorieRecommendation extends AppCompatActivity {
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

        EditText height = (EditText) this.findViewById(R.id.height);
        EditText weight = (EditText) this.findViewById(R.id.weight);
        EditText age = (EditText) this.findViewById(R.id.age);
        Spinner gender = (Spinner) this.findViewById(R.id.gender);

        if (gender.getSelectedItem().toString().equals("Female")) {
            Float calorie = 655.1 + (9.563 * weight)+(1.85 * height)-(4.676 * age);
        } else {
            Float calorie = 66.5 + (13.75 * weight)+(5.003 * height)-(6.775 * age);
        }

    }
}