package com.example.cifraclub.components


import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.example.cifraclub.R

val listVideo = listOf(
    R.raw.videoplayback
)

@Composable
fun mediaPlayer() {

    val context = LocalContext.current

    val player = remember {
        ExoPlayer.Builder(context).build()
    }

    LaunchedEffect(Unit) {
        val mediaItem = MediaItem.Builder()
            .setUri("https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4")
            .setMimeType(MimeTypes.APPLICATION_MP4)
            .build()


    }

 

    // Dispose of the player when the composable is disposed
    DisposableEffect(Unit) {
        onDispose {
            player.release()
        }
    }



    // Use the player to display the video
    // ...
}