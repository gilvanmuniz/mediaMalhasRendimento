package com.example.mediarendimentomalhas.controller;

import android.content.ContentValues;
import android.content.Context;

import com.example.mediarendimentomalhas.datamodel.MediaRendimentoDataModel;
import com.example.mediarendimentomalhas.datasource.DataSource;
import com.example.mediarendimentomalhas.model.MediaRendimento;

public class MediaRendimentoController extends DataSource {

    ContentValues dados;
    public MediaRendimentoController(Context context) {
        super(context);
    }

    public boolean salvar(MediaRendimento obj ){

        boolean success = true;

        dados = new ContentValues();

        dados.put(MediaRendimentoDataModel.getProduct(), obj.getProduct());
        dados.put(MediaRendimentoDataModel.getMesh(), obj.getMesh());
        dados.put(MediaRendimentoDataModel.getType(), obj.getType());
        dados.put(MediaRendimentoDataModel.getColor(), obj.getColor());
        dados.put(MediaRendimentoDataModel.getWeight(), obj.getWeight());
        dados.put(MediaRendimentoDataModel.getData(), obj.getData());
        dados.put(MediaRendimentoDataModel.getAdult(), obj.getAdult());
        dados.put(MediaRendimentoDataModel.getChildren(), obj.getChildren());
        dados.put(MediaRendimentoDataModel.getCustom(), obj.getCustom());

        success = insert(MediaRendimentoDataModel.getTABELA(), dados);

        return success;

    } //fim do método salvar

} //fim da classe
