package com.example.di2p1g6_booking.ui.screens.user.ReservationPage.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Description() {
    Text(
        text = "Description :",
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 4.dp),
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, MaterialTheme.shapes.extraSmall)
            .padding(10.dp, 10.dp),
    ) {
        Text(
            text = "Description de la réservation afin de donner des informations sur la réservation",
        )
    }
}