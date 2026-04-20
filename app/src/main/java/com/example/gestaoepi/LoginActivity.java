package com.example.gestaoepi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText txtEmail, txtSenha;
    private MaterialButton btnEntrar;
    private ImageView imgVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Edge-to-edge padrão e tratar insets
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        setContentView(R.layout.login_layout);

        View root = findViewById(R.id.main);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        // Ligar o java ao xml pelo id
        imgVoltar = findViewById(R.id.imgVoltar);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(v -> {
            String email = (txtEmail != null && txtEmail.getText() != null) ? txtEmail.getText().toString().trim() : "";
            String senha = (txtSenha != null && txtSenha.getText() != null) ? txtSenha.getText().toString().trim() : "";

            // Validação mantida
            if ("etecia".equals(email) && "etecia".equals(senha)) {
                startActivity(new Intent(LoginActivity.this, MenuActivity.class));
                finish();
            } else {
                Toast.makeText(LoginActivity.this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
            }
        });

        imgVoltar.setOnClickListener(v -> {
            // Se quiser apenas fechar a Activity: finish();
            // Se realmente quer abrir SplashActivity:
            startActivity(new Intent(LoginActivity.this, SplashActivity.class));
            finish();
        });
    }
}