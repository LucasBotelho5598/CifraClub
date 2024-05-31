package com.example.cifraclub.model

import androidx.annotation.DrawableRes
import com.example.cifraclub.R

data class ListImage(
    val id: Int,
    @DrawableRes val image: Int?,
)

val imageList = listOf(
    ListImage(0,R.drawable.imagenot),
    ListImage(1,R.drawable.imagenot),
    ListImage(2,R.drawable.imagenot),
    ListImage(3,R.drawable.imagenot),
    ListImage(4,R.drawable.imagenot),
    ListImage(5,R.drawable.imagenot),
    ListImage(6,R.drawable.imagenot),
    ListImage(7,R.drawable.imagenot),
    ListImage(8,R.drawable.imagenot),
    ListImage(9,R.drawable.imagenot),


)