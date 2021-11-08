package com.example.proyecto.data

import com.example.proyecto.data.model.Sf
import com.example.proyecto.data.network.AcronymsService

class AcronymsRepository {
    private val api = AcronymsService()
    suspend fun getAllQuotes(sf:String): List<Sf> {
        return api.getQuotes(sf)
    }
}