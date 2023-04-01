package com.tasmania.navegar_activitys

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var campoTexto: EditText? = null
    var txtResultado: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoTexto=findViewById(R.id.editTextNombre)
        txtResultado=findViewById(R.id.txtResultado)

        val miBoton:Button=findViewById(R.id.button)
        miBoton.setOnClickListener{onClick(1)}

        val miBoton2:Button=findViewById(R.id.button2)
        miBoton2.setOnClickListener{onClick(2)}
    }

    private fun onClick(boton: Int) {
        when(boton){
            1 -> {
                var nombre:String = campoTexto!!.text.toString()
                txtResultado!!.text="Bienvenido $nombre"
                Toast.makeText(this,"Bienvenido $nombre",Toast.LENGTH_LONG).show()
            }
            2 -> {
                val intent = Intent(this,ActivityMensaje::class.java)
                val miBundle:Bundle=Bundle()

                miBundle.putString("Nombre",campoTexto!!.text.toString())
                intent.putExtras(miBundle)

                startActivity(intent)
            }
        }
    }
}