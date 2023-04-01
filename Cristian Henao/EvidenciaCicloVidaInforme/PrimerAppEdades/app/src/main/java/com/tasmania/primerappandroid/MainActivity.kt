package com.tasmania.primerappandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var nombre: EditText? = null
    var direccion: EditText? = null
    var telefono: EditText? = null
    var email: EditText? = null
    var documento: EditText? = null
    var edad: EditText? = null
    var informacion : TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.nombre)
        direccion = findViewById(R.id.direccion)
        telefono = findViewById(R.id.telefono)
        email = findViewById(R.id.email)
        documento = findViewById(R.id.documento)
        edad = findViewById(R.id.edad1)

        val boton = findViewById<Button>(R.id.button)
        boton.setOnClickListener{onclick()}
    }

    private fun onclick() {
        informacion = findViewById(R.id.informacion)
        var datos = ""
        datos+="${nombre!!.text}\n"
        datos+="${direccion!!.text}\n"
        datos+="${telefono!!.text}\n"
        datos+="${email!!.text}\n"
        datos+="${documento!!.text}\n"

        var edad1 = edad!!.text.toString().toInt()
        if(edad1>=0 && edad1<=14){
            datos+="Infante: Tiene ${edad1} años"
        } else if(edad1>=15 && edad1<=17){
            datos+="Adolescente: Tiene ${edad1} años"
        } else if(edad1>=18 && edad1<=64){
            datos+="Adulto: Tiene ${edad1} años"
        } else if(edad1>=65){
            datos+="Adulto mayor: Tiene ${edad1} años"
        }else{
            datos+="Edad imposible"
        }
        informacion!!.text=datos

        Toast.makeText(this, "${datos}", Toast.LENGTH_LONG).show()
    }
}