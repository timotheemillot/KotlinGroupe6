package com.example.di2p1g6_booking.ui.screens.admin.Espace

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.di2p1g6_booking.ui.components.admin.BasicTable
import com.example.di2p1g6_booking.ui.components.admin.WhiteSquare
import com.example.di2p1g6_booking.ui.components.admin.layouts.AdminLayout
import compose.icons.FeatherIcons
import compose.icons.feathericons.LogOut
import compose.icons.feathericons.Plus
import java.lang.invoke.CallSite

@Composable
fun ListeEspaceScreen(site: String = "Site 1") {
    AdminLayout {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp, 0.dp, 16.dp, 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            Text(
                text = "$site",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 24.dp)
            )
            WhiteSquare(title = "Liste des espaces") {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFFF6060),
                        Color(0xFFFF6060)
                    ),
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
                ) {
                    Icon(
                        imageVector = FeatherIcons.Plus,
                        contentDescription = null,
                        tint = colorResource(id = com.example.di2p1g6_booking.R.color.white),
                    )

                }
                BasicTable(arrayOf("Espace 1", "Espace 2", "Espace 3", "Espace 4", "Espace 5"))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListeEspaceScreenPreview() {
    ListeEspaceScreen()
}