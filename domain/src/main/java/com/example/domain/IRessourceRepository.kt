package com.example.domain

interface IRessourceRepository {
    suspend fun getAllRessource(): List<Ressource>{
        return emptyList()
    }

    suspend fun getRessourceById(id : Int): Ressource?{
        return null
    }
}