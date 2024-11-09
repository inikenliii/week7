package com.example.week7.repository

import com.example.week7.service.RestoAPIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RestoContainer {
    private val Base_URL = "http://10.0.2.2/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Base_URL)
        .build()

    private val retrofitService: RestoAPIService by lazy { retrofit.create(RestoAPIService::class.java) }
    val restoRepository: RestoRepository by lazy {
        RestoRepository(retrofitService)
    }


}