package com.example.michaelcapawana.fitness;

/**
 * Calls the android exercise application.
 * @author Grey Winert
 * @author Preston Gagnon
 * @author Michael Capawana
 * @version 1.0
 * @since 1.0
 *
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    }

    public void callCardio(View view) {
        Intent intent = new Intent(this, cardio.class);
        startActivity(intent);
    }

    public void callCore(View view) {
        Intent intent = new Intent(this, activity_core.class);
        startActivity(intent);
    }
}
