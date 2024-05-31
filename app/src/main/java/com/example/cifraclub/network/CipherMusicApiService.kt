package com.example.cifraclub.network


import com.example.cifraclub.model.Music
import retrofit2.http.GET

interface CipherMusicApiService {
    @GET("albums")
    suspend fun getAlbums(): List<Music>
}
