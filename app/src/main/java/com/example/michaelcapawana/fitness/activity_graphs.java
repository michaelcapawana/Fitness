package com.example.michaelcapawana.fitness;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Calendar;

public class activity_graphs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);
    }

    public void BMI(View view) {
        BMI_Date_Data bmiData [];
        BMI_Date_Data BMIObject = new BMI_Date_Data();
        BMI_Date_Data BMINull = new BMI_Date_Data();
        SharedPreferences profile = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences bmiFile = getSharedPreferences("bmi", MODE_PRIVATE);
        SharedPreferences.Editor editor = bmiFile.edit();
        long weight = profile.getInt("Weight", 0);
        long height = profile.getInt("Height", 0);
        int size =  bmiFile.getInt("array_size", 0);
        bmiData = new BMI_Date_Data[size];
        for(int i=0; i < size; i++)
            bmiFile.getAll();
        if (bmiData) {

        }
        BMIObject.setBmi((weight/((height)*(height)) * 703));
        Log.d("Graphs", String.valueOf(bmi));
        Calendar rightnow = Calendar.getInstance();
        int month = rightnow.getTime().getMonth(); //Months are 0-11
        //Log.d("Date", String.valueOf(month));
        int day = rightnow.getTime().getDate();
        //Log.d("Date", String.valueOf(day));

        editor.putInt("array_size", bmiData.length);
        for(int i=0;i < bmiData; i++)
            editor.putString("array_" + i, bmiData[i]);
        editor.commit();
    }

    public void GenerateGraph() {

    }
}
