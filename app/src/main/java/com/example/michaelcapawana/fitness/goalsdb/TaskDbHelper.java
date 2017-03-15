package com.example.michaelcapawana.fitness.goalsdb;

/**
 * Helps store the data in the to-do list associated with activity_goals.
 * @author Grey Winert
 * @author Preston Gagnon
 * @author Michael Capawana
 * @version 1.0
 * @since 1.0
 *
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.michaelcapawana.fitness.activity_goals;

public class TaskDbHelper extends SQLiteOpenHelper {

    public TaskDbHelper(activity_goals context) {
        super(context, TaskContract.DB_NAME, null, TaskContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContract.TaskEntry.TABLE + " ( " +
                TaskContract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContract.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContract.TaskEntry.TABLE);
        onCreate(db);
    }
}