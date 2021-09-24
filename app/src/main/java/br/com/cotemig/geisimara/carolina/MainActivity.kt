package br.com.cotemig.geisimara.carolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var list = ArrayList<Seguro>()
        list.add(Seguro(resources.getString(R.string.seguro_faixaetaria1), 5.0))
        list.add(Seguro(resources.getString(R.string.seguro_faixaetaria2), 4.0))
        list.add(Seguro(resources.getString(R.string.seguro_faixaetaria3), 3.5))
        list.add(Seguro(resources.getString(R.string.seguro_faixaetaria4), 3.3))


        var tabela_seguro = findViewById<ListView>(R.id.lista_Seguro)
        tabela_seguro.adapter = SeguroAdapter(this, list)

        tabela_seguro.setOnItemClickListener { adapterView, view, i, l ->

            //nova activity

            var intent = Intent(this, Calcula_SeguroActivity::class.java)
            intent.putExtra("percentual", list[i].percentual)
            startActivity(intent)
        }
    }
}