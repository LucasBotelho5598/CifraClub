package com.example.cifraclub.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CipherMusic(music: Music) {
    Column {
        VideoPLayer()
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Unspecified
            ),
            title = {
                Column(
                ) {
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
                }
            },
            actions = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Icon(
                        imageVector = Icons.Filled.FavoriteBorder,
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )

                }
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = null,
                    tint = Color.Black,
                )

            }

        )

        Row(
            modifier = Modifier.padding(12.dp)
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

    }

}


