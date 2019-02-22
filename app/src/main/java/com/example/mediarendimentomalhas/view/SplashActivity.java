package com.example.mediarendimentomalhas.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.mediarendimentomalhas.R;
import com.example.mediarendimentomalhas.controller.MediaRendimentoController;
import com.example.mediarendimentomalhas.datasource.DataSource;
import com.example.mediarendimentomalhas.model.MediaRendimento;

import java.util.List;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        apresentarTelaSplash();
    }


    private void apresentarTelaSplash() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                DataSource ds = new DataSource(getBaseContext());

                MediaRendimento obj = new MediaRendimento();

                MediaRendimentoController mediaRendimentoController =
                        new MediaRendimentoController(getBaseContext());

                List<MediaRendimento> objetos = mediaRendimentoController.listar();

                for (MediaRendimento media : objetos) {
                    Log.i("Crud listar", "id" + obj.getId() + "malha"+ obj.getMesh());
                }
                 /*
                //TODO: Remover esse código

                obj.setProduct("Camiseta");
                obj.setMesh("algodao");
                obj.setType("careca");
                obj.setColor("clara");
                obj.setWeight(15.5);
                obj.setData(new Date());
                obj.setAdult(true);

                USADO FOR PARA POPULAR O database.

                for(int i =0; i < 5; i++){

                    mediaRendimentoController.salvar(obj);
                }

                obj.setId(5);

                mediaRendimentoController.deletar(obj);
                */
                Intent telaPrincipal
                        = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(telaPrincipal);

                finish();

            }
        }, SPLASH_TIME_OUT);

    }

} //fim da classe
