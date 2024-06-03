package com.example.cifraclub.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cifraclub.model.ListImage
import com.example.cifraclub.model.imageList



@Composable
fun ListRowCard() {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier.absolutePadding(top = 10.dp, left = 10.dp)
    ) {
        items(imageList) { item ->
            CardList(listImage = item)
        }
    }
}

@Composable
fun CardList(
    listImage: ListImage,
) {

    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.height(350.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        ) {
        Image(
            painter = painterResource(id = listImage.image!!),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )

    }
}
