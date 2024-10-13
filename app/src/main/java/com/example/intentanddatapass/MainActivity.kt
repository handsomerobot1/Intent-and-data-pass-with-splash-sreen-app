package com.example.intentanddatapass

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    private lateinit var submitbtn:Button
    private lateinit var etAge: EditText
    private lateinit var etName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitbtn = findViewById(R.id.submitBtn)
        etAge = findViewById(R.id.etAge)
        etName = findViewById(R.id.etName)


        val name = etName.text
        val age = etAge.text
        submitbtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("name",name.toString())
            intent.putExtra("age",age.toString())
            startActivity(intent)
        }

        btn=findViewById(R.id.btn)
        btn.setOnClickListener {
            val intent =Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}