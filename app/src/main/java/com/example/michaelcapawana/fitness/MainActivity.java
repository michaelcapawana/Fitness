package com.example.michaelcapawana.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callGoals(View view) {
        Intent intent = new Intent(this, activity_goals.class);
        startActivity(intent);
    }

    public void callSchedule(View view) {
        Intent intent = new Intent(this, activity_schedule.class);
        String message = "Schedule";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void callExercise(View view) {
        Intent intent = new Intent(this, activity_exercise.class);
        String message = "Exercise";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void callGraphs(View view) {
        Intent intent = new Intent(this, activity_graphs.class);
        String message = "Graphs";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void callSettings(View view) {
        Intent intent = new Intent(this, activity_settings.class);
        String message = "Settings";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
