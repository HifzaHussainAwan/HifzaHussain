package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelperDatabase extends SQLiteOpenHelper {
    public static String databaseName = "Bit.db";

    public MyHelperDatabase(@Nullable Context context) {
        super(context, "Bit.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("create table allusers(username TEXT primary key,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDatabase, int i, int i1) {
        MyDatabase.execSQL("drop Table if exists allusers");
    }

    public boolean insertData(String username, String password) {
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("username", username);
        values.put("password", password);
        long result = MyDatabase.insert("allusers", null, values);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkUserName(String username) {
        SQLiteDatabase MyDatabase=this.getWritableDatabase();
        Cursor cursor=MyDatabase.rawQuery("Select * from allusers where username=?",new String[]{username});
    if(cursor.getCount()>0){
        return true;
    }
    else {
        return false;
    }
}
}
