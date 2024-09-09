package com.example.di2p1g6_booking.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.di2p1g6_booking.R
import com.example.di2p1g6_booking.ui.components.admin.BasicButton
import com.example.di2p1g6_booking.ui.components.admin.BasicTextField
import com.example.di2p1g6_booking.ui.components.InitLogo
import com.example.di2p1g6_booking.ui.components.admin.WhiteSquare

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp, 0.dp, 16.dp, 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            InitLogo(130)
            LoginCard()
        }
    }
}



@Composable
fun LoginCard(modifier: Modifier = Modifier) {
        WhiteSquare(title = "Connexion") {

            BasicTextField(label = "E-mail :")
            BasicTextField(label = "Mot de passe :")

            Text(
                text = "Mot de passe oublié ?",
                color = Color.Blue,
                modifier = Modifier.drawBehind {
                    val strokeWidth = 1.dp.toPx()
                    val y = size.height - strokeWidth / 2
                    drawLine(
                        color = Color.Blue,
                        start = Offset(0f, y),
                        end = Offset(size.width, y),
                        strokeWidth = strokeWidth
                    )},
                fontSize = 10.sp,
            )

            BasicButton(label = "Valider", modifier = Modifier.padding(0.dp, 32.dp, 0.dp, 4.dp))
        }


    }


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}



@Preview(showBackground = true)
@Composable
fun LoginCardPreview() {
    LoginCard()
}
