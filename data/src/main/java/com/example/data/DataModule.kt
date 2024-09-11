package com.example.data

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val RMAPI_URL = "https://rickandmortyapi.com/api/"

private fun provideHttpClient(): OkHttpClient = OkHttpClient()

private val gson = GsonBuilder()
    .serializeNulls()
    .create()

private fun buildRetrofit(
    okHttpClient: OkHttpClient
): Retrofit = Retrofit.Builder()
    .baseUrl(RMAPI_URL)
    .client(okHttpClient)
    .addConverterFactory(GsonConverterFactory.create(gson))
    .build()

private val retrofit = buildRetrofit(provideHttpClient())

val dataModule = module {
    single<RessourcesService>{
        retrofit.create(RessourcesService::class.java)
    }

    single<RessourceRepository> {
        RessourceRepository(
            get<RessourcesService>()
        )
    }
}