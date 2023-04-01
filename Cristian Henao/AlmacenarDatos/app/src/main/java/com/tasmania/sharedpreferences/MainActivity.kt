package com.tasmania.sharedpreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var message: TextView?=null
    var inputUser: EditText?=null
    var inputPassword: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarComponentes()
    }

    private fun iniciarComponentes() {
        var btnGuardar: Button =findViewById(R.id.btnGuardar)
        btnGuardar.setOnClickListener { GuardarDatos() }

        var btnCargar: Button =findViewById(R.id.btnCargar)
        btnCargar.setOnClickListener { CargarDatos() }

        message=findViewById(R.id.message)
        inputPassword=findViewById(R.id.inputPassword)
        inputUser=findViewById(R.id.inputUser)
    }

    private fun GuardarDatos() {
        var preferences: SharedPreferences =getSharedPreferences("credenciales", Context.MODE_PRIVATE)

        var user:String=inputUser?.text.toString()
        var password:String=inputPassword?.text.toString()

        var editor: SharedPreferences.Editor=preferences.edit()
        editor.putString("user",user)
        editor.putString("password",password)

        message?.text="Usuario: $user \nPassword: $password"

        editor.commit()
    }

    private fun CargarDatos() {
        var preferences: SharedPreferences =getSharedPreferences("credenciales", Context.MODE_PRIVATE)

        var user:String?=preferences.getString("user","No existe la información")
        var password:String?=preferences.getString("password","No existe la información")

        message?.text="Usuario: $user \n\nPassword: $password"

        val intent = Intent(this,MostrarDatos::class.java)
        val miBundle:Bundle = Bundle()

        miBundle.putString("Mensaje", message?.text.toString())

        intent.putExtras(miBundle)
        startActivity(intent)
    }
}