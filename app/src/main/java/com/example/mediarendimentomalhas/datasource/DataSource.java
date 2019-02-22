package com.example.mediarendimentomalhas.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.mediarendimentomalhas.datamodel.MediaRendimentoDataModel;
import com.example.mediarendimentomalhas.model.MediaRendimento;

import java.util.ArrayList;
import java.util.List;


public class DataSource extends SQLiteOpenHelper {

    private static final String DB_NAME = "media_rendimento.sqlite";
    private static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public DataSource(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        //habilita o banco de dados para escrita e leitura:
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

    public boolean atualizar(String tabela,ContentValues dados){

        boolean success = true;

        int id = dados.getAsInteger("id");
        try{
            success = db.update(tabela, dados, "id=?",
                    new String[]{Integer.toString(id)}) > 0;
        }
        catch(Exception e){
            success = false;
        }

        return success;

    }// fim do metodo atualizar

    public List<MediaRendimento> getAllMediaRendimentos(){

        MediaRendimento obj;

        List<MediaRendimento> list = new ArrayList<>();

        String sql = "SELECT * FROM " + MediaRendimentoDataModel.getTABELA() + "ORDER BY produto";

        cursor = db.rawQuery(sql, null);

        if(cursor.moveToFirst()){

            do{
                obj = new MediaRendimento();

                obj.setId(cursor.getInt(cursor.getColumnIndex(MediaRendimentoDataModel.getId())));
                obj.setProduct(cursor.getString(cursor.getColumnIndex(MediaRendimentoDataModel.getProduct())));

                list.add(obj);
            }while (cursor.moveToNext());
        }

        cursor.close();

        return list;
    }


}
