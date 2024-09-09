package com.example.di2p1g6_booking.ui.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import compose.icons.FeatherIcons
import compose.icons.feathericons.Home


@Composable
fun AdminMenu() {

}

@Composable
fun HomeImage()
{
    Icon(
        imageVector = FeatherIcons.Home,
        contentDescription = null,
    )
}

@Preview(showBackground = true)
@Composable
fun HomeImagePreview() {
    HomeImage()
}