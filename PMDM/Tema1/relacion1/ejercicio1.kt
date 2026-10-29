package com.example.ejercicio1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tarjeta = findViewById<TextView>(R.id.tvTarjeta)
        val boton = findViewById<Button>(R.id.btnPresentar)
        val nombre: String="Santiago"
        val edad: Int=20
        var intentos: Int=0
        // TODO 1: declara nombre (String), edad (Int) e intentos (var Int).
        // TODO 2: en el clic aumenta intentos, escribe la tarjeta y usa Log.d.
        boton.setOnClickListener {
            intentos++
            tarjeta.text="Soy " +nombre+" y tengo "+edad+" años y llevo "+intentos+" intentos"
        }
    }
}