package com.example.ressources

import com.example.data.RessourceRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object RessourcesViewModel : KoinComponent{
    val charactersRepository: RessourceRepository by inject()
}