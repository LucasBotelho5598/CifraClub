package com.example.cifraclub.data

import com.example.cifraclub.model.Music
import com.example.cifraclub.network.CipherMusicApiService

interface CipherRepository {
    suspend fun getAlbums(): List<Music>
}

class DefaultCipherRepository(
    private val cipherMusicApiService: CipherMusicApiService
) : CipherRepository {
    override suspend fun getAlbums(): List<Music> = cipherMusicApiService.getAlbums()
}