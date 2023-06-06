package com.example.kotlinseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mywebview = WebView(this)
        mywebview.settings.javaScriptEnabled=true
        setContentView(mywebview)
        mywebview.loadUrl("https://www.google.com")
    }

}