package com.example.rehberuygulamaodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.example.rehberuygulamaodev.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val  ad = binding.editTextAd
        val telefon =binding.editTextTelefon



        binding.buttonKayit.setOnClickListener{
            if (ad.text.isEmpty()||telefon.text.isEmpty()){
                Snackbar.make(it,"Ad ve Telefon Numarası boş bırakılamaz!", Snackbar.LENGTH_SHORT).show()
            }else{

                val loginIntent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(loginIntent)
            }

        }
    }
}