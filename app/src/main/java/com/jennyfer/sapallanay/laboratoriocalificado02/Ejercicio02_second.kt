package com.jennyfer.sapallanay.laboratoriocalificado02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jennyfer.sapallanay.laboratoriocalificado02.databinding.ActivityEjercicio02SecondBinding

class Ejercicio02_second : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio02SecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02SecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listenerComponentUi()
        intent.extras?.let {
            showData(it)
        }
    }

    private fun showData(paramExtras:Bundle){
        val nombre = paramExtras.getString(NAME_KEY)
        val numero = paramExtras.getString(NUMERO_KEY)
        val producto = paramExtras.getString(PRODUCTO_KEY)
        val ciudad = paramExtras.getString(CIUDAD_KEY)
        val direccion = paramExtras.getString(DIRECCION_KEY)
        val ubicacion = "$ciudad, $direccion"

        binding.user.text = nombre
        binding.fono.text = numero
        binding.product.text = producto
        binding.localization.text = ubicacion

    }

    private fun listenerComponentUi() {
        binding.wspImplicit.setOnClickListener {
            Wsp()
        }
        binding.llamarImplicit.setOnClickListener {
            Call()
        }
        binding.mapaImplicit.setOnClickListener {
            Maps()
        }

    }
    private fun Wsp() {
        val phoneNumber = binding.fono.text.toString()
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber")
        startActivity(intent)
    }

    private fun Call() {
        val phoneNumber = binding.fono.text.toString()
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:+51$phoneNumber")
        startActivity(intent)
    }

    private fun Maps(){
        val address = "${binding.localization.text}"
        val geoUri = "http://maps.google.com/maps?q=$address"
        val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse(geoUri))
        startActivity(mapIntent)
    }





}