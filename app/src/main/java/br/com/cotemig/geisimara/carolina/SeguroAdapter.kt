package br.com.cotemig.geisimara.carolina

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class SeguroAdapter (var context: Context, var list: List<Seguro>) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var view = LayoutInflater.from(context).inflate(R.layout.item_seguro, null)

        var idade = view.findViewById<TextView>(R.id.idade)
        idade.text = list[p0].idade

        var percentual = view.findViewById<TextView>(R.id.percentual)
        percentual.text = String.format("%.2f", list[p0].percentual)

        return view

    }
}