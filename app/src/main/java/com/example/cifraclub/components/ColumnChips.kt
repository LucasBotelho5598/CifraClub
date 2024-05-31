package com.example.cifraclub.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cifraclub.model.Chip
import com.example.cifraclub.model.chipList

@Composable
fun LazyChips() {
    LazyRow {
        items(chipList) { chip ->
            RowChipsButton(chip = chip)

        }
    }
}

@Composable
fun RowChipsButton(chip: Chip){
    var selected by remember { mutableStateOf(false) }


    Button(
        border = BorderStroke(1.dp, Color.Gray),
        onClick = { if(selected) Color.White else Color.Red},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),

        modifier = Modifier
            .padding(top=70.dp)
            .clip(CircleShape)
            .padding(4.dp)


    ) {
        Text(text = chip.nameChips, color = Color.Black)

    }




}
