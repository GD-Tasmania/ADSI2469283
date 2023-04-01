package com.tasmania.navegar_activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMensaje : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        val campoMensaje=findViewById<TextView>(R.id.txtMensaje)

        var miBundle: Bundle? = this.intent.extras

        if(miBundle != null){
            campoMensaje.text="Hola ${miBundle.getString("Nombre")} sea bienvenido"
        }
        val botonSalir:Button=findViewById(R.id.button3)
        botonSalir.setOnClickListener{onClick()}
    }

    private fun onClick() {
        finish()
    }
}