package com.example.cifraclub.model

import kotlinx.serialization.Serializable

@Serializable
data class Music(
    val id: Int,
    val tom: String,
    val intro: String,
    val title: String,
    val artist: String,
    val cipherMusic: String
)


