package com.example.tokoku.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.tokoku.R
import com.example.tokoku.helper.SharedPref

class AkunFragment : Fragment() {

    // deklarasi variabel
    lateinit var s:SharedPref
    lateinit var btn_logout:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_akun, container, false)
        btn_logout = view.findViewById(R.id.btn_logout)

        s = SharedPref(requireActivity())

        btn_logout.setOnClickListener {
            s.setStatusLogin(false)
        }

        return view
    }

}