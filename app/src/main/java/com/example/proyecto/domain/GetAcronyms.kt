package com.example.proyecto.domain

import com.example.proyecto.data.AcronymsRepository
import com.example.proyecto.data.model.Sf

class GetAcronyms(){
    private val repository = AcronymsRepository()
    suspend operator fun invoke(sf:String):List<Sf>? = repository.getAllQuotes(sf)

}