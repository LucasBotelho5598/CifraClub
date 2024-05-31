package com.example.cifraclub.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.cifraclub.CifraClubApplication
import com.example.cifraclub.data.CipherRepository
import com.example.cifraclub.model.Music
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException


sealed interface AlbumUiState {
    data class Success(val albums: List<Music>) : AlbumUiState
    object Loading : AlbumUiState
    object Error : AlbumUiState
}

class CipherViewModel(private val cipherRepository: CipherRepository) : ViewModel() {

    var albumUIState: AlbumUiState by mutableStateOf(AlbumUiState.Loading)
        private set

    init {
        getAlbums()
    }

    fun getAlbums() {
        viewModelScope.launch {
            albumUIState = try {
                AlbumUiState.Success(cipherRepository.getAlbums())
            } catch (e: IOException) {
                AlbumUiState.Error
            } catch (e: HttpException) {
                AlbumUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]
                        as CifraClubApplication)
                val cipherRepository = application.container.cipherRepository
                CipherViewModel(cipherRepository = cipherRepository)
            }
        }
    }

}
