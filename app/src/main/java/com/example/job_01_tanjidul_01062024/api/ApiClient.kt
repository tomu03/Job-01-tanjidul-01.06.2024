package com.example.job_01_tanjidul_01062024.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val apiService = retrofit.create(ApiService::class.java)

}