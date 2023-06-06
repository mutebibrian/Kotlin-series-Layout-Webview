package com.example.kotlinseries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview:WebView = view.findViewById(R.id.fview)
        mywebview.webViewClient = object : WebViewClient (){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.settings.javaScriptEnabled=true
        mywebview.loadUrl("www.google.com")
        mywebview.settings.allowContentAccess=true
        mywebview.settings.domStorageEnabled=true
        mywebview.settings.useWideViewPort=true

    }


}