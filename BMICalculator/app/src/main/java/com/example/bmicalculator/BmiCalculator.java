package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

public final class BmiCalculator extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private TextView result;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_bmi_calculator);

        this.height = (EditText)this.findViewById(R.id.height);
        this.weight = (EditText)this.findViewById(R.id.weight);
        this.result = (TextView)this.findViewById(R.id.result);
    }

    public final void calculateBMI(@NotNull View v) {
        String heightStr = this.height.getText().toString();
        String weightStr = this.weight.getText().toString();

        if (!"".equals(heightStr) && !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / (float)100;
            float weightValue = Float.parseFloat(weightStr);
            float bmi = weightValue / (heightValue * heightValue);
            this.displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = bmi + "";
        TextView result = this.result;
        Intrinsics.checkNotNull(result);
        result.setText(bmiLabel);
    }
}