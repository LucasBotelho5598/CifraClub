package com.example.cifraclub.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val nameButton = listOf(
    "Principal",
    "Simplificada"
)

@Preview
@Composable
fun ListRowButtons() {
    LazyRow (
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ){
        items(nameButton) { item ->
            ButtonTwo(textButton = item)
        }
    }
}

@Composable
fun ButtonTwo(
    textButton: String,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color.Gray),
    ) {
        Text(text = textButton)
    }
}

