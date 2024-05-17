package com.jennyfer.sapallanay.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jennyfer.sapallanay.laboratoriocalificado02.databinding.ActivityEjercicio2Binding

class Ejercicio2 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        observeComponents()
    }

    fun observeComponents() {
        binding.registrar.setOnClickListener {
            if (isEmptyInputs()) {
                Toast.makeText(this, "Hay algún campo vacío", Toast.LENGTH_SHORT).show()
            } else {
                goEjercicio02_second()
            }
        }
    }

    private fun goEjercicio02_second() {
        val nombre = binding.nombrecli.text.toString()
        val numero = binding.numerocli.text.toString()
        val producto = binding.productocli.text.toString()
        val ciudad = binding.ciudadcli.text.toString()
        val direccion = binding.direccioncli.text.toString()

        val intent = Intent(this, Ejercicio02_second::class.java)
        intent.putExtra(NAME_KEY, nombre)
        intent.putExtra(NUMERO_KEY, numero)
        intent.putExtra(PRODUCTO_KEY, producto)
        intent.putExtra(CIUDAD_KEY, ciudad)
        intent.putExtra(DIRECCION_KEY, direccion)
        startActivity(intent)
    }

    private fun isEmptyInputs(): Boolean {
        return binding.nombrecli.text.isEmpty() ||
                binding.numerocli.text.isEmpty() ||
                binding.productocli.text.isEmpty() ||
                binding.ciudadcli.text.isEmpty() ||
                binding.direccioncli.text.isEmpty()
    }




}