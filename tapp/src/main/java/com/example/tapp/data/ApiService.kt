package com.example.tapp.data

import com.example.tapp.model.Sitio
import retrofit2.http.GET

interface ApiService {

    @GET("Michelle453/OneDroid-TuristicApp/sitios")
    suspend fun getSitios(): Sitio
}