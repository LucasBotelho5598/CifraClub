package com.example.cifraclub.screen


import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.cifraclub.components.mediaPlayer
import com.example.cifraclub.model.Music
import com.example.cifraclub.videoplayer.VideoPLayer


@Composable
fun HomeScreen(
    albumUiState: AlbumUiState,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    when (albumUiState) {
        is AlbumUiState.Success ->
            CipherMusic(
                music = albumUiState.albums.get(0)
            )

        else -> ""
    }
}

@Composable
fun TopAppBarCipher(){

}


@Composable
fun CipherMusic(
    music: Music,
) {

    Row(
        modifier = Modifier
            .padding(12.dp)
            .wrapContentSize(Alignment.TopEnd)
            .padding(vertical = 50.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top
    ) {
        Icon(
            imageVector = Icons.Filled.FavoriteBorder,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Icon(
            imageVector = Icons.Filled.MoreVert,
            contentDescription = null,
            tint = Color.Black,
        )

    }
    Row(
        modifier = Modifier
            .padding(10.dp)
            .wrapContentSize(Alignment.TopStart)
            .padding(vertical = 50.dp)
            .verticalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top

    ) {
        Column {
            VideoPLayer()
            Text(
                text = music.title,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = music.artist,
                color = Color(0xFFFF9900),
                fontWeight = FontWeight.SemiBold
            )
            Row(
                modifier = Modifier.padding(vertical = 12.dp)
            ) {
                Text(
                    text = "Tom",
                    color = Color.Black,

                    )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = music.tom,
                    color = Color(0xFFFF9900),
                    fontWeight = FontWeight.SemiBold
                )
            }
            Text(
                text = music.intro,
                color = Color(0xFFFF9900),
                fontWeight = FontWeight.SemiBold
            )
            Column (
                modifier = Modifier.width(700.dp)
            ){
                Text(
                    text = music.cipherMusic,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                )
            }

        }

    }




}



