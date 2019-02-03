package com.example.mediarendimentomalhas.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.mediarendimentomalhas.R;

import static com.example.mediarendimentomalhas.R.id.editTextMesh;

public class MainActivity extends AppCompatActivity {

    TextView txtProduct, txtMesh, txtType, txtColor, txtWeight, txtDate;
    EditText editTextProduct, editTextMesh, editTextType, editTextColor, editTextWeight, editTextDate;
    RadioButton radioAdult, radioChildren, radioCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        txtProduct = findViewById(R.id.txtProduct);
        txtMesh = findViewById(R.id.txtMesh);
        txtType = findViewById(R.id.txtType);
        editTextProduct = findViewById(R.id.editTextProduct);
        editTextMesh = findViewById(R.id.editTextMesh);
        editTextType = findViewById(R.id.editTextType);
        editTextColor = findViewById(R.id.editTextColor);
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextDate = findViewById(R.id.editTextDate);
        radioAdult = findViewById(R.id.radioAdult);
        radioChildren = findViewById(R.id.radioChildren);
        radioCustom = findViewById(R.id.radioCustom);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
