package com.example.di2p1g6_booking.ui.components.admin

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp

@Composable
fun BasicTable(array: Array<String>) {
    Column(
        modifier = Modifier.fillMaxWidth()
            .border(1.dp, color = androidx.compose.ui.graphics.Color.Black, shape = RoundedCornerShape(8.dp))
    ) {
        for (i in array) {
            Row(
                modifier = Modifier.border(0.dp, Color.Black, shape = getBottomLineShape(1.dp))
                    .fillMaxWidth()

            ) {
                Text(
                    text = i,
                    modifier = Modifier.padding(4.dp, 8.dp, 0.dp, 8.dp)

                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicTablePreview() {
    BasicTable(arrayOf("Site 1", "Site 2", "Site 3", "Site 4", "Site 5"))
}

@Composable
private fun getBottomLineShape(lineThicknessDp: Dp) : Shape {
    val lineThicknessPx = with(LocalDensity.current) {lineThicknessDp.toPx()}
    return GenericShape { size, _ ->
        // 1) Bottom-left corner
        moveTo(0f, size.height)
        // 2) Bottom-right corner
        lineTo(size.width, size.height)
        // 3) Top-right corner
        lineTo(size.width, size.height - lineThicknessPx)
        // 4) Top-left corner
        lineTo(0f, size.height - lineThicknessPx)
    }
}