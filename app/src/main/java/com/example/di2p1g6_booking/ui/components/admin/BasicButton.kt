package com.example.di2p1g6_booking.ui.components.admin

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BasicButton(label : String,
                modifier: Modifier = Modifier,
                onClick: () -> Unit = {}) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            Color(0xFFFF6060),
            Color(0xFFFF6060)
        ),
        shape = MaterialTheme.shapes.medium,
        modifier = modifier.then(Modifier.width(120.dp)),

    ) {
        Text(
            label,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BasicButtonPreview() {
    BasicButton("Login")
}