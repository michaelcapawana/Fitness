package com.example.michaelcapawana.fitness;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class activity_graph_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_view);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        GridLabelRenderer gridLabel = graph.getGridLabelRenderer();
        gridLabel.setHorizontalAxisTitle("Date");
        gridLabel.setVerticalAxisTitle("BMI");
        SharedPreferences profile = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        ArrayList<BMI_Date_Data> bmiList = new ArrayList();
        String bmiJSon = profile.getString("jsonArray", "");
        bmiList = gson.fromJson(bmiJSon, new TypeToken<ArrayList<BMI_Date_Data>>(){}.getType());
        Log.d("size", Integer.toString(bmiList.size()));
        if(bmiList.size() > 0) {
            Log.d("inIf", "yes");
            DataPoint[] data = new DataPoint[bmiList.size()];
            Log.d("init", "yes");
            for (int i = 0; i < bmiList.size(); i++) {
                Log.d("inLoop", Integer.toString(i));
                data[i] = new DataPoint(i, bmiList.get(i).getBmi());
            }
            Log.d("aftLoop", "yes");
            LineGraphSeries<DataPoint> series = new LineGraphSeries<>(data);
            Log.d("initSeries", "yes");
            graph.addSeries(series);
        }
    }
}
