package com.example.di2p1g6_booking.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons
import compose.icons.feathericons.LogOut

@Composable
fun AdminHeader() {
    Row(
        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(10.dp, 0.dp, 10.dp, 20.dp),
    ) {
        InitLogo(50)
        Text(
            text = "Administration",
            )

        Icon(
            imageVector = FeatherIcons.LogOut,
            contentDescription = null,
            tint = colorResource(id = com.example.di2p1g6_booking.R.color.red),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AdminHeaderPreview() {
    AdminHeader()
}