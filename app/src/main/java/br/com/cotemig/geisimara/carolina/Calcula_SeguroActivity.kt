package br.com.cotemig.geisimara.carolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Calcula_SeguroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcula_seguro)


        var percentual = intent.getDoubleExtra("percentual", 0.0)

        Toast.makeText(this,"percentual $percentual", Toast.LENGTH_LONG).show()

        var btncalcula = findViewById<Button>(R.id.btn_calcular)
        btncalcula.setOnClickListener {

            calcula_seguro(percentual)
        }
    }


    fun calcula_seguro(percentual: Double){

        var inputvalor = findViewById<EditText>(R.id.input_valor_veiculo)
        var valorveic = inputvalor.text.toString().toDouble()

        var resultseguro = (valorveic * percentual) / 100.0
        var parcela = resultseguro / 10.0

        var resultado_seguro = findViewById<TextView>(R.id.resultado_seguro)
        var resultado_parcela = findViewById<TextView>(R.id.resultado_parcela)

        resultado_seguro.text = resources.getString(R.string.seguro_resultado, resultseguro)
        resultado_parcela.text = resources.getString(R.string.seguro_resultado_parcelas, parcela)

    }
}