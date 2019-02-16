package com.example.mediarendimentomalhas.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.mediarendimentomalhas.datamodel.MediaRendimentoDataModel;


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

            db.execSQL(MediaRendimentoDataModel.criarTabela());

        }catch (Exception e){
            Log.e("Media", "--> ERRO: " + e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion,
                          int newVersion) {

    }

    public boolean insert(String tabela, ContentValues dados){

        boolean success = true;
        try{
            success = db.insert(tabela,null, dados) > 0;
        }
        catch(Exception e){
            success = false;
        }

        return success;

    }

        public boolean deletar(String tabela,int id){

            boolean success = true;
            try{
                success = db.delete(tabela, "id=?",
                        new String[]{Integer.toString(id)}) > 0;
            }
            catch(Exception e){
                success = false;
            }

            return success;

        }
}
