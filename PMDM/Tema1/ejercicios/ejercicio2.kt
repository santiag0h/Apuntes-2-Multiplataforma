package com.example.ejercicio2



import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val precio = findViewById<EditText>(R.id.etPrecio)
        val cantidad = findViewById<EditText>(R.id.etCantidad)
        val resultado = findViewById<TextView>(R.id.tvResultado)
        val boton = findViewById<Button>(R.id.btnTicket)

        boton.setOnClickListener {
            // TODO 1: lee los dos EditText como texto.
            // TODO 2: conviértelos de forma segura y valida sus valores.
            // TODO 3: calcula y muestra el importe.
            var coste=precio.text.toString().toDoubleOrNull();
            var unidades=cantidad.text.toString().toIntOrNull()

            if(coste!=null&&unidades!=null&&unidades>0&&coste>0){
                val total=coste*unidades
                resultado.text=total.toString()
            }else{
                resultado.text="Introduce un tipo de valor valido"
            }


        }
    }
}