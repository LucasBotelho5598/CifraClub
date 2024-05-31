package com.example.cifraclub.chords

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cifraclub.components.CardList
import com.example.cifraclub.model.imageList
import kotlin.math.sin


@Preview
@Composable
fun Chords() {
    Box(
        contentAlignment = Alignment.Center,

        ) {
        val textMeasurer = rememberTextMeasurer()
        Canvas(
            modifier = Modifier
                .size(91.dp)
                .align(Alignment.Center)
        ) {
            val canvasHeight = size.height
            val canvasWidth = size.width * sin(0F)
            val numbersList = listOf("1", "2", "3", "4")

            drawLine(
                color = Color.Black,
                start = Offset(x = canvasHeight, y = 2F),
                end = Offset(x = 0F, y = 2F),
                strokeWidth = 10F
            )
            drawLine(
                color = Color.Black,
                start = Offset(x = 0F, y = canvasHeight),
                end = Offset(x = 0F, y = 0F),
                cap = StrokeCap.Round,

                )
            drawLine(
                color = Color.Black,
                start = Offset(x = 50F, y = canvasHeight),
                end = Offset(x = 50F, y = 0F)
            )
            drawLine(
                color = Color.Black,
                start = Offset(x = 100F, y = canvasHeight),
                end = Offset(x = 100F, y = 0F)
            )

            drawLine(
                color = Color.Black,
                start = Offset(x = 150F, y = canvasHeight),
                end = Offset(x = 150F, y = 0F)
            )
            drawLine(
                color = Color.Black,
                start = Offset(x = 200F, y = canvasHeight),
                end = Offset(x = 200F, y = 0F)
            )
            drawLine(
                color = Color.Black,
                start = Offset(x = 250F, y = canvasHeight),
                end = Offset(x = 250F, y = 0F)
            )

            //Circle


            drawCircle(
                color = Color.Black,
                radius = 12f,
                center = Offset(x = 150f, y = 30f),
            )

            drawCircle(
                color = Color.Black,
                radius = 12F,
                center = Offset(x = 100f, y = 80f),
            )
            drawCircle(
                color = Color.Black,
                radius = 12F,
                center = Offset(x = 50f, y = 80f)
            )

            //Horizontally
            drawLine(
                color = Color.Black,
                start = Offset(x = canvasHeight, y = 50F),
                end = Offset(x = 0F, y = 50F)
            )
            drawLine(
                color = Color.Black,
                start = Offset(x = canvasHeight, y = 100F),
                end = Offset(x = 0F, y = 100F)
            )
            drawLine(
                color = Color.Black,
                start = Offset(x = canvasHeight, y = 150F),
                end = Offset(x = 0F, y = 150F)
            )
            drawLine(
                color = Color.Black,
                start = Offset(x = canvasHeight, y = 200F),
                end = Offset(x = 0F, y = 200F)
            )
            drawLine(
                color = Color.White,
                start = Offset(x = canvasHeight, y = 250F),
                end = Offset(x = 0F, y = 250F)
            )


            //Extremidades do quadrado - Esquerdo
            /*drawLine(
                color = Color.Red,
                start = Offset(x = 0F, y = canvasHeight),
                end = Offset(x = 0F, y = 0F )
            )*/

            // Direito
            /*drawLine(
                color = Color.Red,
                start = Offset(x = 550F, y = canvasHeight),
                end = Offset(x = 550F, y = 0F )
            )*/


        }

    }

}


@Composable
fun ListRowChords() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            Chords()
        }
    }
}
