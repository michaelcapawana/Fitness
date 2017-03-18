package com.example.michaelcapawana.fitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
    }

    protected void upClick(View view){
        Log.d("ID Test: ", view.getTag().toString());
        //TextView tempText = (TextView) findViewById(Integer.parseInt(view.getTag().toString()));

    }
}
