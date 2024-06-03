package com.example.cifraclub.model

import androidx.annotation.DrawableRes
import com.example.cifraclub.R

data class ListImage(
    val id: Int,
    @DrawableRes val image: Int?,
)

val imageList = listOf(
    ListImage(0,R.drawable.musicoverjeovah),
    ListImage(1,R.drawable.musicovereunion),
    ListImage(2,R.drawable.musicoverjeovah),
    ListImage(3,R.drawable.musicovereunion),
    ListImage(4,R.drawable.musicoverjeovah),
    ListImage(5,R.drawable.musicovereunion),
    ListImage(6,R.drawable.musicoverjeovah),
    ListImage(7,R.drawable.musicovereunion),
    ListImage(8,R.drawable.musicoverjeovah),
    ListImage(9,R.drawable.musicovereunion),


)