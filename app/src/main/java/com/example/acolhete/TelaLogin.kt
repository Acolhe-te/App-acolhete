package com.example.acolhete

import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TelaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_login)

        val btnVoltar = findViewById<ImageButton>(R.id.btnVoltarImagem)

        btnVoltar.setOnClickListener {
            finish() // Encerra esta tela e volta para a anterior
        }

    }
}