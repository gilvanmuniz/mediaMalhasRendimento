package com.example.mediarendimentomalhas.datamodel;

import java.util.Date;

public class MediaRendimentoDataModel {

    //DADOS PARA CRIAR TABELAS NO DATABASE
    //MOR - MODELO OBJETO RELACIONAL
    //TUPLA OU REGISTROS
    //CRIAR DINAMICAMENTE UMA query SQL para criar a tabela de RENDIMENTOS

    private final static  String TABELA = "rendimanto";

    private final static String id = "id";
    private final static String product = "produto";
    private final static String mesh = "malha";
    private final static String type = "tipo";
    private final static String color = "cor";
    private final static String weight = "peso";
    private final static String data = "data";
    private final static String adult = "adulto";
    private final static String children = "infantil";
    private final static String custom = "personalizar";

    private static String queryCriarTabela = "";

    public static String criarTabela(){

         queryCriarTabela =   "CREATE TABLE " + TABELA ;
         queryCriarTabela +=  "(";
         queryCriarTabela +=  id + " INTEGER PRIMARY KEY, " ;
         queryCriarTabela +=  product + " TEXT, " ;
         queryCriarTabela +=  mesh + " TEXT, " ;
         queryCriarTabela +=  type + " TEXT, " ;
         queryCriarTabela +=  color + " TEXT, ";
         queryCriarTabela +=  weight + " TEXT, ";
         queryCriarTabela +=  data + " NUMERIC, " ;
         queryCriarTabela +=  adult + " NUMERIC, ";
         queryCriarTabela +=  children + " NUMERIC, ";
         queryCriarTabela +=  custom + " NUMERIC ";
         queryCriarTabela +=  " )";

                return queryCriarTabela;

    } //fim do metodo criarTabela

    public static String getTABELA() {
        return TABELA;
    }

    public static String getId() {
        return id;
    }

    public static String getProduct() {
        return product;
    }

    public static String getMesh() {
        return mesh;
    }

    public static String getType() {
        return type;
    }

    public static String getColor() {
        return color;
    }

    public static String getWeight() {
        return weight;
    }

    public static String getData() {
        return data;
    }

    public static String getAdult() {
        return adult;
    }

    public static String getChildren() {
        return children;
    }

    public static String getCustom() {
        return custom;
    }

    public static String getQueryCriarTabela() {
        return queryCriarTabela;
    }



}//fim da classe
