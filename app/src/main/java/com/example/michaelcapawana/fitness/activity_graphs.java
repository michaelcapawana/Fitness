package com.example.michaelcapawana.fitness;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class activity_graphs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);
    }

    public void BMI(View view) {
        SharedPreferences profile = PreferenceManager.getDefaultSharedPreferences(this);
        float weight = profile.getInt("Weight", 0);
        float height = profile.getInt("Height", 0);
        float bmi =  (weight/((height)*(height)) * 703);
        Log.d("Graphs", String.valueOf(bmi));
    }

    public void GenerateGraph() {

    }
}
