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
        Log.d("temp", "Test0");
        Log.d("showTag", view.getTag().toString());
        //int tempInt = Integer.parseInt(view.getTag().toString());
        //Log.d("name", Integer.toString(tempInt));
        TextView tempText = (TextView) findViewById(R.id.textView14);
        /*Log.d("temp", "Test1");
        String temp = tempText.getText().toString();
        Log.d("temp", "Test2");

        int tempInt = Integer.parseInt(temp);
        Log.d("tempInt", String.valueOf(tempInt));
        tempInt++;
        tempText.setText(String.valueOf(tempInt));*/

    }
}
