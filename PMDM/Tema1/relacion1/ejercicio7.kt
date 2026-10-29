rcicio7

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
        val entrada1 = findViewById<EditText>(R.id.etNumero1)
        val entrada2 = findViewById<EditText>(R.id.etNumero2)
        val resultado = findViewById<TextView>(R.id.tvResultado)

        fun calcular(operacion: String){
            // TODO 1: convierte los dos números y valida la entrada.
            // TODO 2: evita dividir entre cero.
            // TODO 3: calcula con when y muestra el resultado.
            val entr1=entrada1.text.toString().toDoubleOrNull()
            val entr2=entrada2.text.toString().toDoubleOrNull()
            if(entr1!=null&&entr2!=null){
                if(operacion=="Sumar"){
                    val cuenta=entr1+entr2
                    resultado.text="El resultado es $cuenta"
                }else if(operacion=="Restar"){
                    val cuenta=entr1-entr2
                    resultado.text="El resultado es $cuenta"
                }else if(operacion=="Multiplicar"){
                    val cuenta=entr1*entr2
                    resultado.text="El resultado es $cuenta"
                }else if(operacion=="Dividir"){
                    if(entr2==0.0){
                        resultado.text="No se puede dividir entre cero"
                        return
                    }
                    val cuenta=entr1/entr2
                    resultado.text="El resultado es $cuenta"
                }else{
                    return
                }

            }else{
                resultado.text="Los numeros no son valido"
            }
        }
        findViewById<Button>(R.id.btnSumar)
            .setOnClickListener { calcular("Sumar")
            }
        findViewById<Button>(R.id.btnRestar)
            .setOnClickListener { calcular("Restar")
            }
        findViewById<Button>(R.id.btnMultiplicar)
            .setOnClickListener { calcular("Multiplicar")
            }
        findViewById<Button>(R.id.btnDividir)
            .setOnClickListener { calcular("Dividir")
            }
        // TODO 4: conecta los cuatro botones con setOnClickListener.
        // Todos deben llamar a calcular, pasando el operador indicado.
    }
}
