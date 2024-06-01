package com.example.job_01_tanjidul_01062024.api

import com.example.job_01_tanjidul_01062024.model.Product
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts(): List<Product>
}