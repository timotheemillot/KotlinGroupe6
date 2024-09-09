package com.example.di2p1g6_booking.ui.screens.admin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.di2p1g6_booking.ui.components.AdminHeader
import com.example.di2p1g6_booking.ui.components.BasicButton
import com.example.di2p1g6_booking.ui.components.BasicTextField
import com.example.di2p1g6_booking.ui.components.WhiteSquare
import com.example.di2p1g6_booking.ui.layouts.AdminLayout


@Composable
fun CreationEspaceScreen() {


    AdminLayout {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp, 0.dp, 16.dp, 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            WhiteSquare(title = "Création d'un espace") {
                BasicTextField("Nom de l'espace : ")
                BasicTextField("Type d'espace : ")
                BasicTextField("Capacité : ")
                BasicButton("Créer", modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp))
            }
        }
    }




}

@Preview(showBackground = true)
@Composable
fun CreationEspaceScreenPreview() {
    CreationEspaceScreen()
}