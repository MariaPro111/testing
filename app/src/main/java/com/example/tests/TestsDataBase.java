package com.example.tests;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TestsDataBase  extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "test_database.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TESTS="tests";
    public static final String TESTS_ID="tests_id";
    public static final String TESTS_TITLE="title";


    public TestsDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TESTS + "(" + TESTS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + TESTS_TITLE + " VARCHAR(255)" + ")");
        //db.execSQL("create table "+ "Questions" + "(" + "QUESTION_ID" + "integer primary key autoincrement," + "question" + "text," + "TEST_ID" + "integer" +")");
        //db.execSQL("create table "+ "Answers" +"(" + "ANSWER_ID" + "integer primary key autoincrement," + "answer" + "text," + "score" +"integer," + "ANSWER_ID" + "integer" +")");


    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
