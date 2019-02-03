package com.example.mediarendimentomalhas.datasource;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.mediarendimentomalhas.datamodel.MediaRendimentoDataModel;
import com.example.mediarendimentomalhas.model.MediaRendimento;

public class DataSource extends SQLiteOpenHelper {

    private static final String DB_NAME = "media_rendimento.sqlite";
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public DataSource(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {

            db.execSQL(MediaRendimentoDataModel.getQueryCriarTabela());

        }catch (Exception e){
            Log.e("Media", "--> ERRO: " + e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
