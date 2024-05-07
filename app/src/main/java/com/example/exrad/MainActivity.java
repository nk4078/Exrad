package com.example.exrad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    RadioButton rdbtn1, rdbtn2, rdbtn3, rdbtn4;
    Switch switch1;
    ConstraintLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdbtn1 = (RadioButton) findViewById(R.id.rdbtn1);
        rdbtn2 = (RadioButton) findViewById(R.id.rdbtn2);
        rdbtn3 = (RadioButton) findViewById(R.id.rdbtn3);
        rdbtn4 = (RadioButton) findViewById(R.id.rdbtn4);
        switch1 = (Switch) findViewById(R.id.switch1);
        back = findViewById(R.id.back);
    }

    public void clicked_change(View view) {
        if (!switch1.isChecked()) {
            if (rdbtn1.isChecked()) {
                back.setBackgroundColor(Color.RED);
            }
            else if (rdbtn2.isChecked()) {
                back.setBackgroundColor(Color.GREEN);
            }
            else if (rdbtn3.isChecked()) {
                back.setBackgroundColor(Color.BLUE);
            }
            else if (rdbtn4.isChecked()) {
                back.setBackgroundColor(Color.YELLOW);
            }
        }
    }

    public void colorClicked(View view) {
        if(switch1.isChecked()){
            if (rdbtn1.isChecked()) {
                back.setBackgroundColor(Color.RED);
            }
            else if (rdbtn2.isChecked()) {
                back.setBackgroundColor(Color.GREEN);
            }
            else if (rdbtn3.isChecked()) {
                back.setBackgroundColor(Color.BLUE);
            }
            else if (rdbtn4.isChecked()) {
                back.setBackgroundColor(Color.YELLOW);
            }
        }
    }
}
