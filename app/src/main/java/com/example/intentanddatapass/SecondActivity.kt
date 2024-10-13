package com.example.intentanddatapass

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    lateinit var btn2:Button
    private lateinit var tvName: TextView
    private lateinit var tvAge: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvName = findViewById(R.id.tvname)
        tvAge = findViewById(R.id.tvage)

        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        tvName.text = name
        tvAge.text = age


        btn2=findViewById(R.id.btn2)
        btn2.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}