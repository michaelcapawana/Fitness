package com.example.michaelcapawana.fitness;

/**
 * Runs the start up interface.
 * Calls each function connected to the button the user presses from the start up screen.
 * @author Grey Winert
 * @author Preston Gagnon
 * @author Michael Capawana
 * @version 1.0
 * @since 1.0
 *
*/

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.provider.CalendarContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * calls and opens the goals activity page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callGoals(View view) {
        Intent intent = new Intent(this, activity_goals.class);
        startActivity(intent);
    }

    /**
     * calls and opens the android calendar application
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void callSchedule(View view) {
        Calendar cal = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime", cal.getTimeInMillis());
        intent.putExtra("allDay", true);
        intent.putExtra("rrule", "FREQ=YEARLY");
        intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
        intent.putExtra("title", "A Test Event from android app");
        startActivity(intent);
    }
    /**
     * calls and opens the Excercise activity page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callExercise(View view) {
        Intent intent = new Intent(this, activity_exercise.class);
        String message = "Exercise";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * calls and opens the graph activity page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callGraphs(View view) {
        Intent intent = new Intent(this, activity_graphs.class);
        String message = "Graphs";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    /**
     * calls and opens the callUserInfo activity page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callUserInfo(View view) {
        Intent intent = new Intent(this, activity_userInfo.class);
        startActivity(intent);
    }
}
