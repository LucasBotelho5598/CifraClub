package com.example.cifraclub.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp


@Composable
fun BottomNavigationBar() {
    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = { /* do something */ }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        Icons.Filled.List,
                        contentDescription = "Home Icon",
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
            IconButton(onClick = {  }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        Icons.Filled.List,
                        contentDescription = "Search Icon",
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
            IconButton(onClick = {  }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        Icons.Filled.List,
                        contentDescription = "Add Icon",
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
            IconButton(onClick = {  }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        Icons.Filled.List,
                        contentDescription = "Media Icon",
                        modifier = Modifier.size(28.dp)
                    )
                }
            }

        }
    }
}