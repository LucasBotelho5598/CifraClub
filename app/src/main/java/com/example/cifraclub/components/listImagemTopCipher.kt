package com.example.cifraclub.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cifraclub.model.ListImage

import com.example.cifraclub.model.imageList


@Preview
@Composable
fun ListImagemTopCipher() {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(5),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = Modifier.height(280.dp)
    ) {
        items(imageList) { item ->
            ImagemList(listImage = item)
        }
    }

}

private val listNumber = listOf("1", "2")

@Composable
fun ImagemList(
    listImage: ListImage,

    ) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.width(200.dp)
    ) {
        Image(
            painter = painterResource(id = listImage.image!!),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .clip(CircleShape)
                .size(40.dp)

        )
        Text(
            text = listNumber[0],
            color = Color.Black,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Column {
            Text("Consagração", color = Color.Black)
            Text("Aline Barros", color = Color.Black)

        }

    }


}