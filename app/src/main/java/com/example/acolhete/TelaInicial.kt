package com.example.acolhete

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Encontrar o botão pelo ID
        val btnAcessarLogin = findViewById<Button>(R.id.ButtonAcessar)
        val btnAcessarCadastro = findViewById<Button>(R.id.ButtonCadastrar)

        // 2. Definir o clique do botão
        btnAcessarLogin.setOnClickListener {
            // 3. Criar a Intent (Contexto atual, Classe de destino)
            val intent = Intent(this, TelaLogin::class.java)
            // 4. Iniciar a nova activity
            startActivity(intent)
        }

        btnAcessarCadastro.setOnClickListener {
            val intent = Intent(this, TelaCadastroActivity::class.java)
            startActivity(intent)
        }
    }
}