package com.binar.chapter5_intent.activitypenerima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter5_intent.pojo.PersonParcelable
import com.binar.chapter5_intent.R
import kotlinx.android.synthetic.main.activity_parcelable.*

class ParcelableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        val objectPersonParcelable = intent.getParcelableExtra<PersonParcelable>("objectpersonparcelable")

        tvNama.text = objectPersonParcelable?.nama
        tvUsia.text = objectPersonParcelable?.usia.toString()
    }
}