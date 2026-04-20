package com.example.gestaoepi;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestaoepi.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        View cardEntregas = findViewById(R.id.cardEntregas);
        View cardEpis = findViewById(R.id.cardEpis);
        View cardFuncionarios = findViewById(R.id.cardFuncionarios);
        View cardRelatorios = findViewById(R.id.cardRelatorios);
        View cardConfiguracoes = findViewById(R.id.cardConfiguracoes);
        View cardLogout = findViewById(R.id.cardLogout);
        View acessoRapido = findViewById(R.id.cardAcessoRapido);

        cardEntregas.setOnClickListener(v -> Toast.makeText(this, "Entradas: Entregas", Toast.LENGTH_SHORT).show());
        cardEpis.setOnClickListener(v -> Toast.makeText(this, "Entradas: EPI's", Toast.LENGTH_SHORT).show());
        cardFuncionarios.setOnClickListener(v -> Toast.makeText(this, "Entradas: Funcionários", Toast.LENGTH_SHORT).show());
        cardRelatorios.setOnClickListener(v -> Toast.makeText(this, "Entradas: Relatórios", Toast.LENGTH_SHORT).show());
        cardConfiguracoes.setOnClickListener(v -> Toast.makeText(this, "Entradas: Configurações", Toast.LENGTH_SHORT).show());
        cardLogout.setOnClickListener(v -> Toast.makeText(this, "Logout solicitado", Toast.LENGTH_SHORT).show());
        acessoRapido.setOnClickListener(v -> Toast.makeText(this, "Acesso rápido: Nova Entrega", Toast.LENGTH_SHORT).show());
    }
}