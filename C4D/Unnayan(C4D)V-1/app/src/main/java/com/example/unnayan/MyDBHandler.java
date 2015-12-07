package com.example.unnayan;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class MyDBHandler extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "entries.db";
    private static final String TABLE_ENTRIES = "entries";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_SUBDIV = "_subdiv";
    private static final String COLUMN_BLOCK = "_block";
    private static final String COLUMN_VILL = "_vill";
    private static final String COLUMN_SUBVILL = "_subvill";
    private static final String COLUMN_LANG = "_lang";
    private static final String COLUMN_GROUP = "_group";
    private static final String COLUMN_AGE = "_age";
    private static final String COLUMN_GENDER = "_gender";
    private static final String COLUMN_CAT = "_cat";
    private static final String COLUMN_EDU = "_edu";
    private static final String COLUMN_OCC = "_occ";
    private static final String COLUMN_CLASS = "_class";
    private static final String COLUMN_NEED1 = "_need1";
    private static final String COLUMN_NEED2 = "_need2";
    private static final String COLUMN_NEED3 = "_need3";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query = "CREATE TABLE " + TABLE_ENTRIES + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_SUBDIV + " TEXT, " +
                COLUMN_BLOCK + " TEXT, " +
                COLUMN_VILL + " TEXT, " +
                COLUMN_SUBVILL + " TEXT, " +
                COLUMN_LANG + " TEXT, " +
                COLUMN_GROUP + " TEXT, " +
                COLUMN_AGE + " TEXT, " +
                COLUMN_GENDER + " TEXT, " +
                COLUMN_CAT + " TEXT, " +
                COLUMN_EDU + " TEXT, " +
                COLUMN_OCC + " TEXT, " +
                COLUMN_CLASS + " TEXT, " +
                COLUMN_NEED1 + " TEXT, " +
                COLUMN_NEED2 + " TEXT, " +
                COLUMN_NEED3 + " TEXT " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {
        db.execSQL("DROP TABLES IF EXISTS " + TABLE_ENTRIES);
        onCreate(db);
    }
    public void addEntries(Entries entry)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_SUBDIV,entry.get_subdiv());
        values.put(COLUMN_BLOCK,entry.get_block());
        values.put(COLUMN_VILL,entry.get_vill());
        values.put(COLUMN_SUBVILL,entry.get_subvill());
        values.put(COLUMN_LANG,entry.get_lang());
        values.put(COLUMN_GROUP,entry.get_group());
        values.put(COLUMN_AGE,entry.get_age());
        values.put(COLUMN_GENDER,entry.get_gender());
        values.put(COLUMN_CAT,entry.get_cat());
        values.put(COLUMN_EDU,entry.get_edu());
        values.put(COLUMN_OCC,entry.get_ooc());
        values.put(COLUMN_CLASS,entry.get_class());
        values.put(COLUMN_NEED1,entry.get_need1());
        values.put(COLUMN_NEED2,entry.get_need2());
        values.put(COLUMN_NEED3,entry.get_need3());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_ENTRIES,null,values);
        db.close();
    }
}
