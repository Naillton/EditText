package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instanciando EditText
        val edt: EditText = findViewById(R.id.editText)

        // o edittext e os demais textos em kotlin tem a funcao text que podem
        // acessar um texto por meio do get ou setar um texto per meio do set
        // vamos acessar um texto ja que no projeto de view nos setamos um texto
        //var edtShow: String = edt.text.toString()
        // como nao temos nenhum listener no nosso campo de edicao de texto
        // o resultado do edtShow sempre sera vazio pois nao conseguimos visualizar
        // mudancas em tempo real sem o listener

        // instanciando textView
        val tv: TextView = findViewById(R.id.textView)

        // criando listener com button
        val btn: Button = findViewById(R.id.button)

        // podemos criar uma funcao de listener no button aqui no codigo com o setListener
        // ou criar uma funcao listen e adcionar ao xml o nome da funcao no atributo onClick

        btn.setOnClickListener {
            // lembrando de sempre definir atributos mutaveis dentro do listener
            val edtShow: String = edt.text.toString()
            // usando o Toast para fornecer uma notificacao simples
            // o Toast tem 3 parametros principais o contexto, o que queremos exibir e o tempo de duracao do toast
            /*Toast.makeText(
                this@MainActivity,
                "Botao clicado toast criado",
                Toast.LENGTH_LONG
            ).show()*/
            // setando o texto editado no textView
            tv.text = edtShow
        }
    }
}