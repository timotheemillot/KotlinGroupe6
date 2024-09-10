package com.example.di2p1g6_booking.ui.screens.user.ConfirmationPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.di2p1g6_booking.ui.components.admin.BasicButton
import com.example.di2p1g6_booking.ui.components.admin.WhiteSquare
import compose.icons.FeatherIcons
import compose.icons.feathericons.CheckCircle
import compose.icons.feathericons.LogOut

@Composable
fun ConfirmationScreen() {
    Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
        modifier = Modifier.fillMaxSize()
            .background(color = Color.LightGray)
            .padding(35.dp, 0.dp)
    ) {
        WhiteSquare(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.45f),
        ) {
            Icon(
                imageVector = FeatherIcons.CheckCircle,
                contentDescription = null,
                tint = colorResource(id = com.example.di2p1g6_booking.R.color.green),
                modifier = Modifier.size(75.dp)
                    .padding(0.dp, 8.dp,  0.dp, 8.dp)
            )

            Text(
                text = "Espace réservé",
                color = colorResource(id = com.example.di2p1g6_booking.R.color.green),
                modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 24.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text = "20/10/2021",
                modifier = Modifier.padding(0.dp, 8.dp),
                fontSize = 12.sp,
                color = Color.Gray
            )
            Text("10:00 - 12:00",
                modifier = Modifier.padding(0.dp, 8.dp),
                fontSize = 12.sp,
                color = Color.Gray
            )
            Text("Salle 1",
                modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 24.dp),
                fontSize = 12.sp,
                color = Color.Gray
            )
            BasicButton("Fermer")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConfirmationScreenPreview() {
    ConfirmationScreen()
}