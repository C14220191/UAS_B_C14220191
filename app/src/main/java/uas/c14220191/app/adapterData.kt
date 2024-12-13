package uas.c14220191.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uas.c14220191.app.database.historyKesehatan

class adapterData (private val historyKesehatan:MutableList <historyKesehatan>):
    RecyclerView.Adapter<adapterData.ListViewHolder>() {
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val _tvTanggal: TextView = itemView.findViewById(R.id.tvTanggal)
        val _tvBeratBadan: TextView = itemView.findViewById(R.id.tvBB)
        val _tvTekananDarah: TextView = itemView.findViewById(R.id.tvTekananDarah)
        val _tvCatatan: TextView = itemView.findViewById(R.id.tvCatatan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterData.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.data_layout, parent, false)\
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val history = historyKesehatan[position]
        holder._tvTanggal.text = history.tanggal
        holder._tvBeratBadan.text = history.beratBadan.toString()
        holder._tvTekananDarah.text = history.tekananDarah.toString()
        holder._tvCatatan.text = history.catatan
    }

    override fun getItemCount(): Int {
        return historyKesehatan.size
    }
}