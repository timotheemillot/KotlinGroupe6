package com.example.di2p1g6_booking.ui.components.admin

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BasicTextField(label : String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(0.dp, 12.dp, 0.dp, 0.dp)
    ) {
        Text(
            text = label,
            fontSize = 12.sp,
            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 2.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = modifier.then(Modifier.border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                .background(Color.White)
                .height(40.dp))
                .clip(RoundedCornerShape(8.dp)),


        )
    }

}

@Preview(showBackground = true)
@Composable
fun BasicTextFieldPreview() {
    BasicTextField("Email :")
}