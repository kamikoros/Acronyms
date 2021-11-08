package com.example.proyecto.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.R
import com.example.proyecto.data.model.Vars

class AdapterList(var list: MutableList<Vars>) : RecyclerView.Adapter<AdapterList.ViewHolder>() {
    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val item_name: TextView = v.findViewById(R.id.item_name)
        val item_freq: TextView = v.findViewById(R.id.item_freq)
        val item_since: TextView = v.findViewById(R.id.item_since)


    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // create a new view
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(v)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val item = list[position]
        holder.item_name.text = "lf: ${item.lf}"
        holder.item_freq.text = "freq: ${item.freq}"
        holder.item_since.text = "since: ${item.since}"
    }

    override fun getItemCount(): Int {
        return list.size
    }


    fun setData(data: MutableList<Vars>) {
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }

}