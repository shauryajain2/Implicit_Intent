package com.example.implicitintent

import android.app.AlarmManager.AlarmClockInfo
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openWeb = findViewById<CardView>(R.id.openweb)
        val openCamera = findViewById<CardView>(R.id.opencamera)

        openWeb.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/shauryajain2/Explicit_Intent")
            startActivity(intent)
        }

        openCamera.setOnClickListener(){
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}