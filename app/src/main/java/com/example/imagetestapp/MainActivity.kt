package com.example.imagetestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var btnImage: Button
    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImage = findViewById(R.id.btnImage)
        img = findViewById(R.id.img)

        btnImage.setOnClickListener {
            downloadImage()
        }
    }

    private fun downloadImage() {
        Glide.with(this)
            .load("https://img.freepik.com/free-photo/painting-mountain-lake-with-mountain-background_188544-9126.jpg")
            .into(img)
    }
}
