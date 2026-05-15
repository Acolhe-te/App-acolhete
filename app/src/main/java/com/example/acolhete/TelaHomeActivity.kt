package com.example.acolhete

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.tela_home)

        val btnAcessarLogin = findViewById<Button>(R.id.btnAcessar)

        btnAcessarLogin.setOnClickListener {
            val intent = Intent(this, TelaHomeActivity::class.java)
            startActivity(intent)
        }
    }
}