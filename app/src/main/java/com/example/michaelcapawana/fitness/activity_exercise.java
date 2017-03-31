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

    /**
     * calls and opens the cardio excercise page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callCardio(View view) {
        Intent intent = new Intent(this, cardio.class);
        startActivity(intent);
    }

    /**
     * calls and opens the core excercise page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callCore(View view) {
        Intent intent = new Intent(this, activity_core.class);
        startActivity(intent);
    }
    /**
     * calls and opens the chest excercise page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callChest(View view) {
        Intent intent = new Intent(this, chest.class);
        startActivity(intent);
    }
    /**
     * calls and opens the callback excercise page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callBack(View view) {
        Intent intent = new Intent(this, back.class);
        startActivity(intent);
    }
    /**
     * calls and opens the legs excercise page
     * @param  view takes the activity view so that it can start the page
     * @return has no returns
     */
    public void callLegs(View view) {
        Intent intent = new Intent(this, activity_legs.class);
        startActivity(intent);
    }
}
