package com.example.cantinhodaleia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);
        getSupportActionBar().hide();

        Button btnvoltarprog = (Button)findViewById(R.id.btnvoltar);


        //BOTAO DE RETORNO À MAIN
        btnvoltarprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Contatos.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}