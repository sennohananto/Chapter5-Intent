package com.binar.chapter5_intent.activitypenerima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter5_intent.R
import kotlinx.android.synthetic.main.activity_bundle.*

class BundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle)

        //Terima Bundle yang ada di dalam intent
        val bundleDariIntent = intent.getBundleExtra("sebuahbundle")

        //Buka bundle untuk mendapatkan Nama dan Usia
        val namaDariBundle = bundleDariIntent.getString("nama")
        val usiaDariBundle = bundleDariIntent.getInt("usia")

        //Set nama dan usia ke TextView
        tvNama.text = namaDariBundle
        tvUsia.text = usiaDariBundle.toString()
    }
}