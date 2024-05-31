package com.example.cifraclub.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cifraclub.R
import com.example.cifraclub.components.LazyChips
import com.example.cifraclub.components.ListImagemTopCipher
import com.example.cifraclub.components.ListRowCard


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreenPrincipal() {

    val topCipherSpace: Dp = 500.dp
    val bottomCipherSpace: Dp = 820.dp
    val bottomCipherGrid:Dp = 550.dp

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Unspecified,

            ),
        title = {
            Row(
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logocifra),
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                        .offset(-50.dp)
                        .padding(start = 8.dp)
                )
            }
        },
        actions = {
            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically

            ){
                Box(
                    modifier = Modifier
                        .align(Alignment.Top)
                        .width(80.dp)
                        .height(30.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF1DB400))
                        .padding(8.dp)
                ) {
                    Text(
                        maxLines = 1,
                        text = "Seja PRO",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .offset(y = (-2).dp)
                    )

                }


            }
            Image(
                painter = painterResource(id = R.drawable.profilemusic),
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp)
                    .size(30.dp)
            )

        }

    )
    LazyChips()

    Row(
        modifier = Modifier
            .absolutePadding(top = 100.dp)

    ) {
        ListRowCard()
    }
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Text(
            "Top Cifras",
            color = Color.Black,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(12.dp)
                .absolutePadding(top = topCipherSpace)

        )




    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .absolutePadding(top = bottomCipherGrid),
    ) {
        ListImagemTopCipher()
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .absolutePadding(top = bottomCipherSpace),
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color.Gray),
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .padding(12.dp)


        ) {
            Text(
                text = "Ver mais cifras",
                color = Color.Black
            )

        }



    }

}

