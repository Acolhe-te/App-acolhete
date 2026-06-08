package com.example.acolhete

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class telaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Configuração de preenchimento automático das barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Mapeamento dos botões usando os IDs exatos do seu XML
        val btnAcessarConta = findViewById<Button>(R.id.button)
        val btnCadastrese = findViewById<Button>(R.id.button2)
        val btnContinuarSemCadastro = findViewById<TextView>(R.id.buttonSemCadastro)

        // 2. Ação do botão "Acessar conta"
        btnAcessarConta.setOnClickListener {
            Toast.makeText(this, "Acessar conta clicado (offline)", Toast.LENGTH_SHORT).show()

            // Para abrir a tela de Login quando ela existir, descomente as linhas abaixo:
            /*
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            */
        }

        // 3. Ação do botão "Cadastre-se"
        btnCadastrese.setOnClickListener {
            Toast.makeText(this, "Cadastre-se clicado (offline)", Toast.LENGTH_SHORT).show()

            // Para abrir a tela de Cadastro quando ela existir, descomente as linhas abaixo:
            /*
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
            */
        }

        // 4. Ação do texto clicável "Continuar sem Cadastro"
        btnContinuarSemCadastro.setOnClickListener {
            Toast.makeText(this, "Navegando direto para a Home...", Toast.LENGTH_SHORT).show()

            // Para abrir a tela principal direto, descomente as linhas abaixo:
            /*
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            */
        }
    }
}