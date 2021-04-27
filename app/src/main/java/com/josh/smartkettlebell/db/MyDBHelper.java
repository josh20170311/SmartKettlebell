package com.josh.smartkettlebell.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Date;

import static com.josh.smartkettlebell.db.MyContract.*;

public class MyDBHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 2;

    public MyDBHelper(Context context, String dbName) {
        super(context, dbName, null, DB_VERSION);

    }

    public Cursor getRecords(){
        return getReadableDatabase().rawQuery("SELECT * FROM "+RecordEntry.TABLE_NAME,new String[]{});
    }
    public Cursor getData(int RecordId){
        return getReadableDatabase().rawQuery("SELECT * FROM "+DataEntry.TABLE_NAME
                +" WHERE _id = ?;",new String[]{RecordId+""});
    }

    public void insertData(float[] data, float[] facc_data,long recordId,long timeStamp){
        ContentValues values = new ContentValues();
        values.put(DataEntry.COLUMN_RECORD_ID,recordId);
        values.put(DataEntry.COLUMN_TIMESTAMP,timeStamp);

        String[] columns = DataEntry.COLUMNS_DATA;
        for (int i = 0; i < columns.length-3; i++) {
            values.put(columns[i],data[i]);
        }

        for (int i = columns.length -3; i < columns.length; i++) {
            values.put(columns[i],facc_data[i - columns.length + 3]);
        }

        getWritableDatabase().insert(DataEntry.TABLE_NAME,null,values);
    }
    public long createRecord(String tag){
        ContentValues values = new ContentValues();
        values.put(RecordEntry.COLUMN_TIMESTAMP, new Date().getTime());
        values.put(RecordEntry.COLUMN_TAG, tag);
        return getWritableDatabase().insert(RecordEntry.TABLE_NAME,null,values);
    }

    public void deleteRecord(String id){
        getWritableDatabase().delete(RecordEntry.TABLE_NAME,"_id = ?",new String[]{id});
        getWritableDatabase().delete(DataEntry.TABLE_NAME,
                DataEntry.COLUMN_RECORD_ID+"= ?",
                new String[]{id});
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlCreateDataTable = String.format(
                "CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT ," + // _ID
                        "%s TEXT NOT NULL ," + // RECORD ID
                        "%s INTEGER NOT NULL ," + //TIMESTAMP
                        "%s REAL NOT NULL ," + //ACC X
                        "%s REAL NOT NULL ," +
                        "%s REAL NOT NULL ," +
                        "%s REAL NOT NULL ," + // GYR X
                        "%s REAL NOT NULL ," +
                        "%s REAL NOT NULL ," +
                        "%s REAL NOT NULL ," + // MAG X
                        "%s REAL NOT NULL ," +
                        "%s REAL NOT NULL ," +
                        "%s REAL NOT NULL ," + // filtered ACC X
                        "%s REAL NOT NULL ," +
                        "%s REAL NOT NULL " +
                        ");",
                DataEntry.TABLE_NAME,
                DataEntry._ID,
                DataEntry.COLUMN_RECORD_ID,
                DataEntry.COLUMN_TIMESTAMP,
                DataEntry.COLUMN_ACC_X,
                DataEntry.COLUMN_ACC_Y,
                DataEntry.COLUMN_ACC_Z,
                DataEntry.COLUMN_GYR_X,
                DataEntry.COLUMN_GYR_Y,
                DataEntry.COLUMN_GYR_Z,
                DataEntry.COLUMN_MAG_X,
                DataEntry.COLUMN_MAG_Y,
                DataEntry.COLUMN_MAG_Z,
                DataEntry.COLUMN_FACC_X,
                DataEntry.COLUMN_FACC_Y,
                DataEntry.COLUMN_FACC_Z
        );
        String sqlCreateRecordTable = String.format(
                "CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT ," +
                        "%s INTEGER NOT NULL, " +
                        "%s TEXT NOT NULL " +
                        ");",
                RecordEntry.TABLE_NAME,
                RecordEntry._ID,
                RecordEntry.COLUMN_TIMESTAMP,
                RecordEntry.COLUMN_TAG

        );

        db.execSQL(sqlCreateDataTable);
        db.execSQL(sqlCreateRecordTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+DataEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+RecordEntry.TABLE_NAME);
        onCreate(db);
    }
}
