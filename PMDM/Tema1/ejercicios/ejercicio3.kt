package com.example.ejercicio3
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
        val edad = findViewById<EditText>(R.id.etEdad)
        val resultado = findViewById<TextView>(R.id.tvResultado)
        val boton = findViewById<Button>(R.id.btnComprobar)

        boton.setOnClickListener {
            // TODO 1: convierte edad con toIntOrNull().
            // TODO 2: valida null y los límites 0..120.
            // TODO 3: usa && para comprobar el acceso.
            // TODO 4: distingue menor de 18, permitido y mayor de 65.
            val anos=edad.text.toString().toIntOrNull()
            if(anos!=null&&anos>0&&anos<120){
                if(anos<18) {
                    resultado.text = "Eres muy chico pero puedes entrar"
                }else if(anos<65){
                    resultado.text="Tienes la edad correcta para entrar"
                }else{
                    resultado.text="No puedes tener tantos años"
                }
            }else{
                resultado.text="La edad añadida es invalida"
            }
        }
    }
}