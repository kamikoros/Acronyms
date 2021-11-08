package com.example.proyecto.data.network

import com.example.proyecto.data.model.Sf
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AcronymsApiClient {
    @GET("dictionary.py")
    suspend fun getAllAcronyms(@Query("sf") sf: String): Response<List<Sf>>
}