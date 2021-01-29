package com.example.cantinhodaleia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Endereco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endereco);
        getSupportActionBar().hide();


        Button btnvoltarprog = (Button)findViewById(R.id.btnvoltar);


        //BOTAO DE RETORNO À MAIN
        btnvoltarprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Endereco.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}