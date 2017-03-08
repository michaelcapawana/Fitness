package com.example.michaelcapawana.fitness;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        SharedPreferences profile = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences bmiFile = getSharedPreferences("bmi", MODE_PRIVATE);
        SharedPreferences.Editor editor = bmiFile.edit();
        long weight = profile.getInt("Weight", 0);
        long height = profile.getInt("Height", 0);
        int size =  bmiFile.getInt("array_size", 0);
        bmiData = new BMI_Date_Data[size];
        /*if (bmiFile.json) {
            String bmiJSon = bmiFile.json;
            Gson gson = new Gson();
            BMI_Date_Data[] bmiArray = gson.fromJson(bmiJson, BMI_Date_Data[].class);
        }
        else*/
        long height2 = (height*height);
        BMIObject.setBmi(((weight*703)/height2));
        Calendar rightnow = Calendar.getInstance();
        BMIObject.setMonth(rightnow.getTime().getMonth()); //Months are 0-11
        //Log.d("Date", String.valueOf(month));
        BMIObject.setDay(rightnow.getTime().getDate());
        //Log.d("Date", String.valueOf(day));
        BMIObject.setYear(rightnow.getTime().getYear());
        BMI_Date_Data[] bmiArray = {new BMI_Date_Data(BMIObject.bmi, BMIObject.getYear(), BMIObject.getMonth(), BMIObject.getDay())};
        String jsonString = new Gson().toJson(bmiArray);
        Log.d("Json Value: ", jsonString);

        //push into array as string and make sure that reading it out works.
    }

    public void GenerateGraph() {

    }
}
