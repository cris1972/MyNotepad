package com.naswet.mynotpad.db

import android.provider.BaseColumns

object MyDbNeme {
    const val TABLE_NAME = "entry"
    const val COLUMN_NAME_TITLE = "title"
    const val COLUMN_NAME_CONTENT = "content"
    const val DATABASE_VERSIONS =1
    const val DATABASE_NAME ="MyData"
    const val   CREATE_TABLE =
        "CREATE TABLE IF NOT EXIST  $TABLE_NAME (" +
                "${DATABASE_VERSIONS}_ID INTEGER PRIMARY KEY," +
                "$COLUMN_NAME_TITLE TEXT " +
                "$COLUMN_NAME_CONTENT TEXT )"

const val SQL_DELETE_TABEL = "DROP TABLE IF EXISTS $TABLE_NAME"
}