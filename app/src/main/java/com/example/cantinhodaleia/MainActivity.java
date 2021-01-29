package com.example.cantinhodaleia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        Button btnCadastrarprog = (Button)findViewById(R.id.btnCadastrar);
        Button btnCardapioprog = (Button)findViewById(R.id.btnCardapio);
        Button btnContateprog = (Button)findViewById(R.id.btnContate);
        Button btnEnderecoprog = (Button)findViewById(R.id.btnEndereco);
        Button btnNossaHisprog = (Button)findViewById(R.id.btnNossaHis);
        Button btnConhecaprog = (Button)findViewById(R.id.btnConhecanois);


        /*botões de link*/
        //CADASTRAR
        btnCadastrarprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Cadastrar.class);
                startActivity(it);
            }
        });
        //CARDAPIO
        btnCardapioprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent (MainActivity.this, Cardapio.class);
                startActivity(it);
            }
        });
        //CONTATE
        btnContateprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Contatos.class);
                startActivity(it);
            }
        });

        //ENDERECO
        btnEnderecoprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Endereco.class);
                startActivity(it);
            }
        });
        //NOSSA HISTORIA
        btnNossaHisprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, NossaHistoria.class);
                startActivity(it);
            }
        });
        //CONHEÇA O CANTINHO
        btnConhecaprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,  ConhecaCantinho.class);
                startActivity(it);
            }
        });
    }
}