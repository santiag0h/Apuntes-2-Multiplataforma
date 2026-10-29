package com.example.r2ejercicio4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
private fun minimo(b1: Double, b2: Double, b3: Double): Boolean{
    if(b1<4||b2<4||b3<4){
        return false
    }else{
        return true
    }
}

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1: identifica y conecta las vistas por su R.id.
        // TODO 2: crea las funciones pedidas en el enunciado.
        // TODO 3: programa los eventos de clic y las validaciones.
        // TODO 4: comprueba todos los casos de prueba del PDF.
        val bloque1 = findViewById<EditText>(R.id.etBloque1)
        val bloque2 = findViewById<EditText>(R.id.etBloque2)
        val bloque3 = findViewById<EditText>(R.id.etBloque3)
        val btnnota=findViewById<Button>(R.id.btnEvaluar)
        val btnlimpiar=findViewById<Button>(R.id.btnLimpiar)
        val notas=findViewById<TextView>(R.id.tvNota)
        val estado=findViewById<TextView>(R.id.tvEstado)
        btnnota.setOnClickListener {
            val B1=bloque1.text.toString().toDoubleOrNull()
            val B2=bloque2.text.toString().toDoubleOrNull()
            val B3=bloque3.text.toString().toDoubleOrNull()
            if(B1!=null&&B2!=null&&B3!=null){
                if(B1 in 0.0..10.0&&B2 in 0.0..10.0&& B3 in 0.0..10.0){
                    val min=minimo(B1,B2,B3)
                    val media=(B1+B2+B3)/3
                    notas.text="Tu media es: "+media
                    if(min==true){
                        if(media<5){
                            estado.text="Estas suspenso por no llegar al 5 de media"

                            estado.setTextColor(getColor(R.color.rojo_error))
                        }else{
                            estado.text="Estas Aprobado"
                            estado.setTextColor(getColor(R.color.verde_ok))
                        }

                    }else{
                        estado.text="Estas Suspenso por tener menos de un 4 en una evaluacion"

                        estado.setTextColor(getColor(R.color.rojo_error))
                    }
                }else{
                    estado.text="Los numeros deben ser del 1 al 10"
                }
            }else{
                estado.text="Rellene todos los campos correctamente"
            }
        }
        btnlimpiar.setOnClickListener {
            bloque1.setText("")
            bloque2.setText("")
            bloque3.setText("")
            notas.text = "Ponga las notas para ver el resultado"
            estado.text = "Ponga las notas para ver el resultado si aprobastes"
        }
    }
}
