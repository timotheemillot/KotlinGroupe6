package com.example.di2p1g6_booking.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.di2p1g6_booking.R
import java.lang.reflect.Modifier

@Composable
fun InitLogo(size : Int = 100) {
    Image(
        painter = painterResource(id = R.drawable.logo_init),
        contentDescription = "logo",
        modifier = androidx.compose.ui.Modifier.size(size.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun InitLogoPreview() {
    InitLogo()
}