package com.binar.chapter5_intent.activitypenerima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter5_intent.R
import kotlinx.android.synthetic.main.activity_put_extra.*

class PutExtraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_put_extra)

        //Nerima data dari intent dengan cara Get Extra
        val namaDariIntent = intent.getStringExtra("nama")
        val usiaDariIntent = intent.getIntExtra("usia",0)

        //set te TextView
        tvNama.text = namaDariIntent
        tvUsia.text = usiaDariIntent.toString()
    }
}