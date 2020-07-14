package com.binar.chapter5_intent.activitypenerima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter5_intent.pojo.PersonSerializable
import com.binar.chapter5_intent.R
import kotlinx.android.synthetic.main.activity_serializable.*

class SerializableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)

        //mendapatkan object Person dari Intent menggunakan SerializableExtra
        val objectPerson = intent.getSerializableExtra("objectpersonserializable") as PersonSerializable

        //Set ke TextView
        tvNama.text = objectPerson.nama
        tvUsia.text = objectPerson.usia.toString()
    }
}