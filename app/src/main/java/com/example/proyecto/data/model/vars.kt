package com.example.proyecto.data.model
import com.google.gson.annotations.SerializedName

data class Vars(
    @SerializedName("lf")
    val lf: String,
    @SerializedName("freq")
    val freq: String,
    @SerializedName("since")
    val since: String
)
