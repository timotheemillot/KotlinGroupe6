package com.example.di2p1g6_booking.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WhiteSquare(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier
            .background(Color.White, MaterialTheme.shapes.medium)
            .padding(24.dp, 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        content()
    }
}