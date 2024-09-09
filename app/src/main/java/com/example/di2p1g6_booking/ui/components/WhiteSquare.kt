package com.example.di2p1g6_booking.ui.components

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WhiteSquare(title: String? = null,content: @Composable () -> Unit){
    Card(
        modifier = Modifier.shadow(4.dp)
    ){
        Column(
            modifier = Modifier
                .background(Color.White, MaterialTheme.shapes.medium)
                .padding(24.dp, 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            if(title != null)
            {
                Text(
                    text = title,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 24.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            content()
        }
    }

}