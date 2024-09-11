package com.example.data

import retrofit2.http.GET

interface RessourcesService {
    @GET("ressource")
    fun getRessources(): getRessourceDto
}