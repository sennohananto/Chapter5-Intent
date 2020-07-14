package com.binar.chapter5_intent.pojo

import android.os.Parcel
import android.os.Parcelable

data class PersonParcelable(val nama:String, val usia: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeInt(usia)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonParcelable> {
        override fun createFromParcel(parcel: Parcel): PersonParcelable {
            return PersonParcelable(parcel)
        }

        override fun newArray(size: Int): Array<PersonParcelable?> {
            return arrayOfNulls(size)
        }
    }
}