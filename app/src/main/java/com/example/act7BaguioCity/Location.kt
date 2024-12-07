package com.example.act7BaguioCity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    val name: String,
    val imageResource: Int,
    val category: String,
    val details: String
) : Parcelable

