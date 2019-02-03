package com.example.mediarendimentomalhas.datamodel;

import java.util.Date;

public class MediaRendimentoDataModel {

    //DADOS PARA CRIAR TABELAS NO DATABASE
    //MOR - MODELO OBJETO RELACIONAL
    //TUPLA OU REGISTROS
    //CRIAR DINAMICAMENTE UMA query SQL para criar a tabela de RENDIMENTOS

    private static final String TABELA = "rendimanto";
    private static final String id = "id";
    private static final String product = "produto";
    private static final String mesh = "malha";
    private static final String type = "tipo";
    private static final String color = "cor";
    private static final String weight = "peso";
    private static final String data = "data";
    private static final String adult = "adulto";
    private static final String children = "infantil";
    private static final String custom = "personalizar";

    private static String queryCriarTabela = " ";

    public String criarTabela(){

        queryCriarTabela += "CREATE TABLE IF NOT EXISTS " + TABELA +
                "(" + id + "INTEGER PRIMARY KEY," +
                      product + "VARCHAR(30)," +
                      mesh + "VARCHAR(30)," +
                      type + "VARCHAR(30)," +
                      color + "VARCHAR(30)," +
                      weight + "VARCHAR(30)," +
                      data + "DATE," +
                      adult + "VARCHAR(30)," +
                      children + "TINYINT," +
                      custom + " boolean )";

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

    public static void setQueryCriarTabela(String queryCriarTabela) {
        MediaRendimentoDataModel.queryCriarTabela = queryCriarTabela;
    }

}//fim da classe
