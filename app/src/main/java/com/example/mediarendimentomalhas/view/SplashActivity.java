package com.example.mediarendimentomalhas.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mediarendimentomalhas.R;
import com.example.mediarendimentomalhas.datasource.DataSource;

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

                Intent telaPrincipal
                        = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(telaPrincipal);

            }
        }, SPLASH_TIME_OUT);

    }

} //fim da classe