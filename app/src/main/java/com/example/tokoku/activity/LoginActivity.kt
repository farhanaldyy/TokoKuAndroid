package com.example.tokoku.activity

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.tokoku.R
import com.example.tokoku.helper.SharedPref

class LoginActivity : AppCompatActivity() {

    lateinit var s:SharedPref
    lateinit var btn_login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_login = findViewById(R.id.btn_login)

        s = SharedPref(this)

        btn_login.setOnClickListener{
            s.setStatusLogin(true)
        }

    }
}