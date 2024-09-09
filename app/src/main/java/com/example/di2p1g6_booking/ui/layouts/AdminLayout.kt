package com.example.di2p1g6_booking.ui.layouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.di2p1g6_booking.R
import com.example.di2p1g6_booking.ui.components.AdminHeader
import com.example.di2p1g6_booking.ui.components.InitLogo
import com.example.di2p1g6_booking.ui.screens.LoginCard


@Composable
fun AdminLayout(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        AdminHeader()
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun AdminLayoutPreview() {
    AdminLayout{}
}
