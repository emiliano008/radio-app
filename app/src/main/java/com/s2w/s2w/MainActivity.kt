package com.s2w.s2w

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    //private
    private val BASE_URL = "https://s2w.com.ar"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wbUrl.webChromeClient = object : WebChromeClient()
        {

        }

        wbUrl.webViewClient = object : WebViewClient()
        {

        }

        var settings : WebSettings = wbUrl.settings
        settings.javaScriptEnabled = true

        wbUrl.loadUrl(BASE_URL)
    }
}


