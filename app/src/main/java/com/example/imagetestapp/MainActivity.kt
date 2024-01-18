package com.example.imagetestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var btnImage: Button
    private lateinit var img : ImageView
    private lateinit var edt : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImage = findViewById(R.id.btnImage)
        img = findViewById(R.id.img)
        edt = findViewById(R.id.edt)

        btnImage.setOnClickListener {
            downloadImage()
        }
    }

    private fun downloadImage() {
        val imageUrl = edt.text.toString()
        Glide.with(this)
            .load(imageUrl)
            .into(img)
    }
}
