package com.example.di2p1g6_booking

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.data.dataModule
import com.example.di2p1g6_booking.ui.MyApp
import com.example.di2p1g6_booking.ui.screens.LoginScreen
import com.example.di2p1g6_booking.ui.screens.admin.Espace.ListeEspaceScreen
import com.example.di2p1g6_booking.ui.screens.admin.Site.ListeSiteScreen
import com.example.di2p1g6_booking.ui.theme.DI2P1G6BookingTheme
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        startKoin{
            androidContext(this@MainActivity)
            modules(
                dataModule
            )
        }

        setContent {
            DI2P1G6BookingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MyApp()
                  }
            }
        }
    }
}

