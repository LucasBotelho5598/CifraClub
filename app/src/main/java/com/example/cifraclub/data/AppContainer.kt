package com.example.cifraclub.data

import com.example.cifraclub.network.CipherMusicApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit




interface AppContainer {
    val cipherRepository: CipherRepository
}

class DefaultAppContainer : AppContainer {
    private val BASE_URL = "http://192.168.0.7:8080/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: CipherMusicApiService by lazy {
        retrofit.create(CipherMusicApiService::class.java)
    }

    override val cipherRepository: CipherRepository by lazy {
        DefaultCipherRepository(retrofitService)
    }

}


