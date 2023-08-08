package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        nome.text="Cesta de compras"

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text="Feijão,biscoito,arroz,café,açucar."

        val valor = findViewById<TextView>(R.id.valor)
        valor.text="25.99 R$"
    }
}