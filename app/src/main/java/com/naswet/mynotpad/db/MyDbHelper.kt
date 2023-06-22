package com.naswet.mynotpad.db
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context: Context):
    SQLiteOpenHelper(context, MyDbNeme.DATABASE_NAME,
        null, MyDbNeme.DATABASE_VERSIONS) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(MyDbNeme.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL(MyDbNeme.SQL_DELETE_TABEL)

    }

}