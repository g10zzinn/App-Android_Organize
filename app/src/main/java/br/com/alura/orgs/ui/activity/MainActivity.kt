package br.com.alura.orgs.ui.activity


import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        setContentView(R.layout.activity_main)
       // val nome = findViewById<TextView>(R.id.nome)
       // nome.text="Cesta de compras"

       // val descricao = findViewById<TextView>(R.id.descricao)
       // descricao.text="Feijão,biscoito,arroz,café,açucar."

       // val valor = findViewById<TextView>(R.id.valor)
     //   valor.text="25.99 R$"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(

            produto(
                nome = "Café jitaúna",
                descricao = "Teste",
                valor  = BigDecimal("5.99")
            ),
                    produto(
                    nome = "Café Melita",
            descricao = "Teste 1",
            valor  = BigDecimal("7.49")
        ),
        ) )
            recyclerView.layoutManager = LinearLayoutManager(this)



    }

}