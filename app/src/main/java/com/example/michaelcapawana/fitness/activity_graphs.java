package com.example.michaelcapawana.fitness;

/**
 * Updates user bmi data.
 * Displays user bmi data with dates in a graph.
 * @author Grey Winert
 * @author Preston Gagnon
 * @author Michael Capawana
 * @version 1.0
 * @since 1.0
 *
 */

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;

public class activity_graphs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);
    }

    public void BMI(View view) {
        ArrayList<BMI_Date_Data> bmiList = new ArrayList<>();
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<BMI_Date_Data>>(){}.getType();
        SharedPreferences profile = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences bmiFile = getSharedPreferences("bmi", MODE_PRIVATE);
        SharedPreferences.Editor editor = bmiFile.edit();
        SharedPreferences.Editor profEdit = profile.edit();
        long weight = profile.getInt("Weight", 0);
        long height = profile.getInt("Height", 0);
        long height2 = (height * height);
        EditText editText = (EditText) findViewById(R.id.editText2);
        if (profile.getBoolean("Initialized", false) == true) {
            Log.d("test", Boolean.toString(bmiFile.getBoolean("Initialized", false)));
            if (bmiFile.contains("jsonArray")) {
                String bmiJSon = bmiFile.getString("jsonArray", "");
                bmiList = gson.fromJson(bmiJSon, new TypeToken<ArrayList<BMI_Date_Data>>(){}.getType());

                weight = Integer.parseInt(editText.getText().toString());

            }
            editor.remove("jsonArray");
        }
        BMI_Date_Data arrayObject = storeData(weight, height2, bmiList);
        if (bmiList.size() > 0) {
            BMI_Date_Data temp = bmiList.get(bmiList.size() - 1);
            if ((arrayObject.getDay() == temp.getDay()) && (arrayObject.getMonth() == temp.getMonth()) && (arrayObject.getYear() == temp.getYear())) {
                Log.d("if", "inside");
                bmiList.set(bmiList.size() - 1, arrayObject);
            } else {
                Log.d("else", "inside");
                bmiList.add(arrayObject);
            }
        }
        else {
            bmiList.add(arrayObject);
        }
        String jsonArray = gson.toJson(bmiList);
        editor.putString("jsonArray", jsonArray);
        profEdit.putBoolean("Initialized", true);
        profEdit.commit();
        editor.commit();
        for (int i = 0; i < bmiList.size(); i++) {
            Log.d("Works", bmiList.get(i).display()); //make a display method;
            }
        }

    public BMI_Date_Data storeData(long weight, long height, ArrayList<BMI_Date_Data> bmiList) {
        BMI_Date_Data BMIObject = new BMI_Date_Data();
        BMIObject.setBmi(((weight * 703) / height));
        Calendar rightnow = Calendar.getInstance();
        BMIObject.setMonth(rightnow.getTime().getMonth()); //Months are 0-11
        BMIObject.setDay(rightnow.getTime().getDate());
        BMIObject.setYear(rightnow.getTime().getYear());
        //BMI_Date_Data[] bmiArray = {new BMI_Date_Data(BMIObject.bmi, BMIObject.getYear(), BMIObject.getMonth(), BMIObject.getDay())};
        return BMIObject;
    }

    public void GenerateGraph() {

    }
}
