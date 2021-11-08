package com.example.proyecto.data.model

import com.google.gson.annotations.SerializedName

data class Sf (
    @SerializedName("sf")
    val sf: String,
    @SerializedName("lfs")
    val lfs: List<Lfs>
    )
