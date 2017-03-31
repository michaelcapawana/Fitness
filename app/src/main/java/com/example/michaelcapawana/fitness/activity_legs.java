package com.example.michaelcapawana.fitness;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class activity_legs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legs);

        //Get the widgets reference from XML layout
        final TextView tv = (TextView) findViewById(R.id.tv);
        final TextView tv2 = (TextView) findViewById(R.id.tv2);
        final TextView tv3 = (TextView) findViewById(R.id.tv3);
        NumberPicker np = (NumberPicker) findViewById(R.id.np);
        NumberPicker np2 = (NumberPicker) findViewById(R.id.np2);
        NumberPicker np3 = (NumberPicker) findViewById(R.id.np3);
        NumberPicker np4 = (NumberPicker) findViewById(R.id.np4);
        NumberPicker np5 = (NumberPicker) findViewById(R.id.np5);
        NumberPicker np6 = (NumberPicker) findViewById(R.id.np6);
        NumberPicker np7 = (NumberPicker) findViewById(R.id.np7);
        NumberPicker np8 = (NumberPicker) findViewById(R.id.np8);
        NumberPicker np9 = (NumberPicker) findViewById(R.id.np9);

        //Set TextView text color
        tv.setTextColor(Color.parseColor("#ffd32b3b"));
        tv2.setTextColor(Color.parseColor("#ffd32b3b"));
        tv3.setTextColor(Color.parseColor("#ffd32b3b"));

        //Populate NumberPicker values from minimum and maximum value range
        //Set the minimum value of NumberPicker
        np.setMinValue(0);
        np2.setMinValue(0);
        np3.setMinValue(0);
        np4.setMinValue(0);
        np5.setMinValue(0);
        np6.setMinValue(0);
        np7.setMinValue(0);
        np8.setMinValue(0);
        np9.setMinValue(0);

        //Specify the maximum value/number of NumberPicker
        np.setMaxValue(5);
        np2.setMaxValue(50);
        np3.setMaxValue(100);
        np4.setMaxValue(5);
        np5.setMaxValue(50);
        np6.setMaxValue(100);
        np7.setMaxValue(5);
        np8.setMaxValue(50);
        np9.setMaxValue(100);

        NumberPicker.Formatter formatter = new NumberPicker.Formatter() {
            @Override
            public String format(int value) {
                int diff = value * 5;
                return "" + diff;
            }
        };
        np3.setFormatter(formatter);
        np6.setFormatter(formatter);
        np9.setFormatter(formatter);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(true);
        np2.setWrapSelectorWheel(true);
        np3.setWrapSelectorWheel(true);
        np4.setWrapSelectorWheel(true);
        np5.setWrapSelectorWheel(true);
        np6.setWrapSelectorWheel(true);
        np7.setWrapSelectorWheel(true);
        np8.setWrapSelectorWheel(true);
        np9.setWrapSelectorWheel(true);

        //Set a value change listener for NumberPicker
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                //tv.setText("Sets: " + newVal);
            }
        });

        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                //tv2.setText("Reps: " + newVal);
            }
        });

        np3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                //tv3.setText("lbs: " + newVal * 5);
            }
        });
    }}