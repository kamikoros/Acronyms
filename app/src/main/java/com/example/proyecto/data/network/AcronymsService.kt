package com.example.proyecto.data.network

import com.example.proyecto.core.RetrofitHelper
import com.example.proyecto.data.model.Sf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AcronymsService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getQuotes(sf:String): List<Sf> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(AcronymsApiClient::class.java).getAllAcronyms(sf)
            response.body() ?: emptyList()
        }
    }
}