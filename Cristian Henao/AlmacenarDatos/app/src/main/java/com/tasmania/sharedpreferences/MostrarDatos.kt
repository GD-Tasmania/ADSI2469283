package com.tasmania.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MostrarDatos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_datos)
        val datos: TextView =findViewById(R.id.newMessage)

        var miBundle: Bundle? = this.intent.extras

        if(miBundle!=null){
            datos!!.text="${miBundle.getString("Mensaje")}"
        }else{
            datos!!.text="No hay informacion"
        }
        val botonSalir: Button =findViewById(R.id.button)
        botonSalir.setOnClickListener{onClick()}
    }

    private fun onClick() {
        finish()
    }
}