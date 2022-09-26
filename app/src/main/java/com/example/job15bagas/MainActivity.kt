package com.example.job15bagas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText( this, "aplikasi berjalan", Toast.LENGTH_SHORT).show()

        val nama = findViewById<Button>(R.id.nama)
        val kelas = findViewById<Button>(R.id.kelas)
        val nis = findViewById<Button>(R.id.nis)

        nama.setOnClickListener{
            Toast.makeText( this, "Bagas Saputra", Toast.LENGTH_SHORT).show()
        }
        kelas.setOnClickListener{
            Toast.makeText( this, "XI PPLG 1", Toast.LENGTH_SHORT).show()
        }
        nis.setOnClickListener{
            Toast.makeText( this, "2978", Toast.LENGTH_SHORT).show()
        }


    }
}