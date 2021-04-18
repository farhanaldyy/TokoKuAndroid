package com.example.tokoku.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.tokoku.R
import com.example.tokoku.adapter.AdapterProduk
import com.example.tokoku.adapter.AdapterSlider
import com.example.tokoku.model.Produk

class HomeFragment : Fragment() {

    lateinit var vpSlider: ViewPager
    lateinit var rvProduk:RecyclerView
    lateinit var rvTerlaris:RecyclerView
    lateinit var rvElektronik:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view : View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvTerlaris = view.findViewById(R.id.rv_terlaris)
        rvElektronik = view.findViewById(R.id.rv_elektronik)

        //array untuk gambar
        val arraySlider = ArrayList<Int>()
        arraySlider.add(R.drawable.slide1)
        arraySlider.add(R.drawable.slide2)
        arraySlider.add(R.drawable.slide3)

        // panggil adapter
        val adapterSlider = AdapterSlider(arraySlider, activity)
        vpSlider.adapter = adapterSlider
        // layout produk
        val layoutManager1 = LinearLayoutManager(activity)
        layoutManager1.orientation = LinearLayoutManager.HORIZONTAL
        // layout terlaris
        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL
        // layout elektronik
        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrayProduk)
        rvProduk.layoutManager = layoutManager1

        rvTerlaris.adapter = AdapterProduk(arrayTerlaris)
        rvTerlaris.layoutManager = layoutManager2

        rvElektronik.adapter = AdapterProduk(arrayElektronik)
        rvElektronik.layoutManager = layoutManager3

        return view
    }

    val arrayProduk: ArrayList<Produk>get() {
        val array = ArrayList<Produk>()

        val p1 = Produk()
        p1.nama = "Hp Envy 13"
        p1.harga = "Rp.5.000.000"
        p1.gambar = R.drawable.hp_pavilion_13_an0006na

        val p2 = Produk()
        p2.nama = "Hp Core i5"
        p2.harga = "Rp.6.000.000"
        p2.gambar = R.drawable.hp_envy_13_aq0019tx

        val p3 = Produk()
        p3.nama = "Hp Pavilion 13"
        p3.harga = "Rp.9.000.000"
        p3.gambar = R.drawable.hp_notebook_14_bs709tu

        array.add(p1)
        array.add(p2)
        array.add(p3)

        return array
    }

    val arrayTerlaris: ArrayList<Produk>get() {
        val array = ArrayList<Produk>()

        val t1 = Produk()
        t1.nama = "Hp Envy"
        t1.harga = "Rp.5.000.000"
        t1.gambar = R.drawable.hp_notebook_14_bs709tu

        val t2 = Produk()
        t2.nama = "Hp Core"
        t2.harga = "Rp.6.000.000"
        t2.gambar = R.drawable.hp_envy_13_aq0019tx

        val t3 = Produk()
        t3.nama = "Hp Pavilion"
        t3.harga = "Rp.9.000.000"
        t3.gambar = R.drawable.hp_pavilion_13_an0006na

        array.add(t1)
        array.add(t2)
        array.add(t3)

        return array
    }

    val arrayElektronik: ArrayList<Produk>get() {
        val array = ArrayList<Produk>()

        val t1 = Produk()
        t1.nama = "Hp Envy 13"
        t1.harga = "Rp.5.000.000"
        t1.gambar = R.drawable.hp_envy_13_aq0019tx

        val t2 = Produk()
        t2.nama = "Hp Core i5"
        t2.harga = "Rp.6.000.000"
        t2.gambar = R.drawable.hp_pavilion_13_an0006na

        val t3 = Produk()
        t3.nama = "Hp Pavilion 13"
        t3.harga = "Rp.9.000.000"
        t3.gambar = R.drawable.hp_notebook_14_bs709tu

        array.add(t1)
        array.add(t2)
        array.add(t3)

        return array
    }

}