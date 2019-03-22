package br.com.dtidigital.whoarethoseguys.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.dtidigital.whoarethoseguys.R
import br.com.dtidigital.whoarethoseguys.model.entities.Tribo
import kotlinx.android.synthetic.main.lista_tribos.view.*

class RecycleViewAdapter(private val listaNomeTribo : List<Tribo>,
                         private val context: Context) : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lista_tribos, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaNomeTribo.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tribo = listaNomeTribo[position]

        holder?.let {
            it.bindView(tribo)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(tribo: Tribo) {

            val nomeTribo = itemView.item_tribo

            nomeTribo.text = tribo.nomeTribo
        }

    }

}