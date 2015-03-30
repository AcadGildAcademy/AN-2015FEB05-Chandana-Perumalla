package com.example.chandana.todoapp;

import android.content.ClipData;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Chandana on 28-03-2015.
 */
public class DataBaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;


    // Database Name
    private static final String DATABASE_NAME = "DoAppDataBase";

    //  table name
    private static final String TABLE_NAME = "DoAppTable";

    //  Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_DATE = "date";
    private static final String KEY_STATUS = "status";

    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TO_DO_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_TITLE + " TEXT,"
                + KEY_DESCRIPTION + " TEXT," + KEY_DATE + " TEXT," + KEY_STATUS + " INTEGER" + ")";
        db.execSQL(CREATE_TO_DO_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    void addTodoAction(item To_do_action) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_TITLE, To_do_action.getTodo_title());
        values.put(KEY_DESCRIPTION, To_do_action.getTodo_description());
        values.put(KEY_DATE,To_do_action.getTodo_date());
        if(To_do_action.getTodo_action_status())
            values.put(KEY_STATUS,1);
        else
            values.put(KEY_STATUS, 0);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public int updateTo_do_action(item To_do_action) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_TITLE, To_do_action.getTodo_title());
        values.put(KEY_DESCRIPTION, To_do_action.getTodo_description());
        values.put(KEY_DATE,To_do_action.getTodo_date());

        if(To_do_action.getTodo_action_status())
            values.put(KEY_STATUS,Integer.valueOf(1));
        else
            values.put(KEY_STATUS, Integer.valueOf(0));
        // updating row
        return db.update(TABLE_NAME, values, KEY_ID + " = ?",
                new String[] { String.valueOf(To_do_action.getId()) });
    }

    // Getting All Tasks
    public ArrayList<item> getAllTasks() {
        ArrayList<item> To_Do_List = new ArrayList<>();

        String selectQuery = "SELECT  * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                item i = new item();
                i.setId(Integer.parseInt(cursor.getString(0)));
                i.setTodo_title(cursor.getString(1));
                i.setTodo_description(cursor.getString(2));
                i.setTodo_date(cursor.getString(3));
                i.setTodo_action_status(Integer.parseInt(cursor.getString(4)));

                To_Do_List.add(i);
            } while (cursor.moveToNext());
        }
        return To_Do_List;
    }

    public void deleteItem(item i) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, KEY_ID + " = ?",
                new String[] { String.valueOf(i.getId())});
        db.close();
    }

    item getTo_do_item(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[] { KEY_ID,
                        KEY_TITLE, KEY_DESCRIPTION, KEY_DATE, KEY_STATUS }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
        Boolean status;
        if(Integer.parseInt(cursor.getString(4))==0)
            status = false;
        else
            status = true;

        item To_do_item = new item(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3),status);
         return To_do_item;
    }
}
