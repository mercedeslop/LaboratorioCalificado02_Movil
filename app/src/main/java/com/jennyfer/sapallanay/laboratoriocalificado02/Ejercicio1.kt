package com.jennyfer.sapallanay.laboratoriocalificado02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jennyfer.sapallanay.laboratoriocalificado02.databinding.ActivityEjercicio1Binding

class Ejercicio1 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        observeComponents()

    }

    fun observeComponents() {
        binding.mostrar.setOnClickListener {

            binding.imagen.visibility = android.view.View.VISIBLE
        }

        binding.ocultar.setOnClickListener {

            binding.imagen.visibility = android.view.View.GONE
        }
    }
}