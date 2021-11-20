package com.turicticapp.turisticapp


import com.google.gson.annotations.SerializedName

data class SitioItem(
    @SerializedName("description")
    val description: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("score")
    val score: String,
    @SerializedName("urlPicture")
    val urlPicture: String
)