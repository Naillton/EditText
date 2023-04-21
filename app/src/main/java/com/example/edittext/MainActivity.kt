package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instanciando EditText
        val edt: EditText = findViewById(R.id.editText)

        // o edittext e os demais textos em kotlin tem a funcao text que podem
        // acessar um texto por meio do get ou setar um texto per meio do set
        // vamos acessar um texto ja que no projeto de view nos setamos um texto
        val edtShow: String = edt.text.toString()
        // como nao temos nenhum listener no nosso campo de edicao de texto
        // o resultado do edtShow sempre sera vazio pois nao conseguimos visualizar
        // mudancas em tempo real sem o listener
    }
}