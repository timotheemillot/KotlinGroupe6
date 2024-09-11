package com.example.di2p1g6_booking.ui.screens.user.ReservationPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.di2p1g6_booking.ui.components.admin.WhiteSquare
import com.example.di2p1g6_booking.ui.screens.user.ReservationPage.components.Description
import com.example.di2p1g6_booking.ui.screens.user.ReservationPage.components.SpacePhoto
import compose.icons.FeatherIcons
import compose.icons.feathericons.Calendar

@Composable
fun ReservationScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.LightGray)
            .padding(20.dp, 0.dp),
    ) {
        SpacePhoto()
        Description()
        Row(
            modifier = Modifier.fillMaxWidth().padding(0.dp, 16.dp),
            horizontalArrangement = Arrangement.Center


        ){
            Column(
                modifier = Modifier.background(Color.White, MaterialTheme.shapes.extraSmall)
            )
            {
                Icon(
                    imageVector = FeatherIcons.Calendar,
                    contentDescription = null,
                    tint = Color.Black,
                )
                Text( "20/10/2021",
                    modifier = Modifier

                        .padding(8.dp, 8.dp),
                    textAlign = TextAlign.Center,
                )
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun ReservationScreenPreview() {
    ReservationScreen()
}