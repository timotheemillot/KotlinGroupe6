package com.example.di2p1g6_booking.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.di2p1g6_booking.R
import java.lang.reflect.Modifier



@Composable
fun AdminMenu() {

}

@Composable
fun HomeImage()
{
    val svgPainter: Painter = rememberSvgPainter(resource = R.raw.home)
    Image(
        painter = svgPainter,
        contentDescription = "SVG Image",
        modifier = Modifier.size(100.dp)
    )
}