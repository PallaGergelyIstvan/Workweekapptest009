package com.example.workweekapptest009.data


import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelperTasks(context: Context): SQLiteOpenHelper(context,"USERDB",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE USERS(" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NAME TEXT, " +
                "EMAIL TEXT, " +
                "TASK TEXT, " +
                "TIME TEXT, " +
                "COMMA TEXT)")

        db?.execSQL("INSERT INTO USERS(NAME, EMAIL, TASK, TIME,COMMA) " +
                "VALUES('sad','asd@gmail.com','asd','sad','sad')")
        db?.execSQL("INSERT INTO USERS(NAME, EMAIL, TASK, TIME,COMMA) " +
                "VALUES('asd','asd@gmail.com','asd','asd','sad')")
        db?.execSQL("INSERT INTO USERS(NAME, EMAIL, TASK, TIME,COMMA) " +
                "VALUES('asd','asd@gmail.com','asd','asd','sad')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}