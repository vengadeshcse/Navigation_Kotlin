package com.example.navigation_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        btn_one_time_test.setOnClickListener({
            Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()
        })

    }
}