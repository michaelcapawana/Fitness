package com.example.michaelcapawana.fitness;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class activity_graph_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_view);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        SharedPreferences profile = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        ArrayList<BMI_Date_Data> bmiList = new ArrayList<>();
        String bmiJSon = profile.getString("jsonArray", "");
        bmiList = gson.fromJson(bmiJSon, new TypeToken<ArrayList<BMI_Date_Data>>(){}.getType());
        if(bmiList.size() > 0) {
            LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
            //for (int i = 0; i < bmiList.size(); i++) {
            //    new DataPoint(0, bmiList.get(0).getBmi()),
            //}
            });
        }
        //graph.addSeries(series);
    }

}
