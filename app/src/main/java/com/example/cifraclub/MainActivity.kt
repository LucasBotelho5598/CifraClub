package com.example.cifraclub

import MusicsApp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.cifraclub.components.ListImagemTopCipher
import com.example.cifraclub.components.mediaPlayer
import com.example.cifraclub.screen.BodyAdd
import com.example.cifraclub.screen.HomeScreen

import com.example.cifraclub.ui.theme.CifraClubTheme
import com.example.cifraclub.videoplayer.VideoPLayer


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
            CifraClubTheme {
                BodyAdd()

            }
        }
    }
}





