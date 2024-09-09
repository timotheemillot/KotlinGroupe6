package com.example.di2p1g6_booking.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.di2p1g6_booking.R
import com.example.di2p1g6_booking.ui.components.BasicButton
import com.example.di2p1g6_booking.ui.components.BasicTextField
import com.example.di2p1g6_booking.ui.components.InitLogo
import com.example.di2p1g6_booking.ui.components.WhiteSquare

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
    Card(
        modifier = Modifier.shadow(4.dp)
    )
    {

        WhiteSquare() {
            Text(
                text = "Connexion",
                fontSize = 25.sp,
                modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 24.dp),
                fontWeight = FontWeight.Bold
            )
            BasicTextField(label = "E-mail :", modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 12.dp))
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
