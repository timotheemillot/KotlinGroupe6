package com.example.di2p1g6_booking.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.di2p1g6_booking.ui.screens.LoginScreen
import com.example.di2p1g6_booking.ui.screens.admin.Espace.CreationEspaceScreen
import com.example.di2p1g6_booking.ui.screens.admin.Espace.ListeEspaceScreen
import com.example.di2p1g6_booking.ui.screens.admin.Site.ListeSiteScreen

@Composable
fun MyApp() {
    // Crée un contrôleur de navigation
    val navController = rememberNavController()

    // NavHost gère la navigation entre les écrans
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController = navController) }
        composable("listeSites") { ListeSiteScreen() }
        composable("listeRessources") { ListeEspaceScreen() }
        composable("creationRessource") { CreationEspaceScreen() }
    }
}