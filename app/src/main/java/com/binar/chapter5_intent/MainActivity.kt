package com.binar.chapter5_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter5_intent.activitypenerima.BundleActivity
import com.binar.chapter5_intent.activitypenerima.ParcelableActivity
import com.binar.chapter5_intent.activitypenerima.PutExtraActivity
import com.binar.chapter5_intent.activitypenerima.SerializableActivity
import com.binar.chapter5_intent.pojo.PersonParcelable
import com.binar.chapter5_intent.pojo.PersonSerializable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnPutExtra.setOnClickListener {
            val kePutExtraActivity = Intent(this, PutExtraActivity::class.java)

            kePutExtraActivity.putExtra("nama",etNama.text.toString())
            kePutExtraActivity.putExtra("usia",etUsia.text.toString().toInt())

            startActivity(kePutExtraActivity)
        }

        btnBundle.setOnClickListener {
            //buat object intent
            val keBundleActivity = Intent(this, BundleActivity::class.java)

            //buat object bundle
            val sebuahBundle = Bundle()

            //Semua data dimasukkin ke Bundle
            sebuahBundle.putString("nama",etNama.text.toString())
            sebuahBundle.putInt("usia",etUsia.text.toString().toInt())

            //Bundle dimasukkin ke object intent
            keBundleActivity.putExtra("sebuahbundle",sebuahBundle)

            //Start Activity
            startActivity(keBundleActivity)
        }

        btnSerializable.setOnClickListener {
            //Buat object intent
            val keSerializableActivity = Intent(this, SerializableActivity::class.java)

            //pembuatan object person
            val objectPersonSerializable =
                PersonSerializable(
                    etNama.text.toString(),
                    etUsia.text.toString().toInt()
                )

            //masukin object person ke object intent
            keSerializableActivity.putExtra("objectpersonserializable", objectPersonSerializable)

            //start activity
            startActivity(keSerializableActivity)
        }

        btnParcelable.setOnClickListener {
            //buat object intent
            val keParcelableActivity = Intent(this, ParcelableActivity::class.java)

            //Buat object person
            val objectPersonParcelable =
                PersonParcelable(
                    etNama.text.toString(),
                    etUsia.text.toString().toInt()
                )

            //Masukin object person ke object intent
            keParcelableActivity.putExtra("objectpersonparcelable", objectPersonParcelable)

            //Start Activity
            startActivity(keParcelableActivity)
        }
    }
}