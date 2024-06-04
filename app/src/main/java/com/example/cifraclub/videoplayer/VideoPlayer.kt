package com.example.cifraclub.videoplayer

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer


@Composable
fun VideoPLayer(){

    val context = LocalContext.current
    val player = ExoPlayer.Builder(context).build()



    val mediaItem = MediaItem.fromUri("")

    player.setMediaItem(mediaItem)

    player.prepare()

    player.play()

    player.addListener(
        object : Player.Listener {
            override fun onIsPlayingChanged(isPlaying: Boolean) {
                if (isPlaying) {
                    // Active playback.
                } else {
                    // Not playing because playback is paused, ended, suppressed, or the player
                    // is buffering, stopped or failed. Check player.playWhenReady,
                    // player.playbackState, player.playbackSuppressionReason and
                    // player.playerError for details.
                }
            }
        }
    )
}