package com.example.tokoku.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tokoku.R
import com.example.tokoku.model.Produk

class AdapterProduk(var data:ArrayList<Produk>):RecyclerView.Adapter<AdapterProduk.Holder>() {

    class Holder(view : View): RecyclerView.ViewHolder(view) {
        // variabel untuk menampung nama gambar dan harga
        val tv_nama = view.findViewById<TextView>(R.id.tv_nama)
        val tv_harga = view.findViewById<TextView>(R.id.tv_harga)
        val gambar_produk = view.findViewById<ImageView>(R.id.gambar_produk)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        // bagian logika untuk men set value
        holder.tv_nama.text = data[position].nama
        holder.tv_harga.text = data[position].harga
        holder.gambar_produk.setImageResource(data[position].gambar)
    }

}