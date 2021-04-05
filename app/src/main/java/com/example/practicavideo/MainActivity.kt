package com.example.practicavideo

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.practicavideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.reproductor)

        val contenido: Uri =Uri.parse("android.resource://$packageName/${R.raw.primero}")
        binding.reproductor.setVideoURI(contenido)
        binding.reproductor.requestFocus()
        binding.reproductor.start()
    }
}