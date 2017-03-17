package com.example.michaelcapawana.fitness;

/**
 * Saves the user info as a shared preference.
 * @author Grey Winert
 * @author Preston Gagnon
 * @author Michael Capawana
 * @version 1.0
 * @since 1.0
 *
 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class activity_userInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }

    public void saveProfile(View view) {
        Log.d("MainActivity", "Saving Profile Information");
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        //if(Integer.parseInt(editText2.getText().toString()) > 120 && Integer.parseInt(editText2.getText().toString()) < 0)
        //{
          //  throw new AssertionError("Invalid Age");
        //}
        Context context = activity_userInfo.this;
        SharedPreferences profile = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = profile.edit();
        editor.putString("Name", editText.getText().toString());
        editor.putInt("Age", Integer.parseInt(editText2.getText().toString()));
        editor.putInt("Height", Integer.parseInt(editText3.getText().toString()));
        editor.putInt("Weight", Integer.parseInt(editText4.getText().toString()));
        editor.putString("Gender", editText5.getText().toString());
        editor.putBoolean("Initialized", false);
        editor.commit();
        Log.d("UserInfo", "Saved!");
        String name = profile.getString("Name", "");
        Log.d("UserInfo", name);
        Log.d("Initialized?", Boolean.toString(profile.getBoolean("Initialized", false)));
    }

}
