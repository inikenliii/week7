package com.example.week7.service

import com.example.week7.model.RestoData
import retrofit2.http.GET
import retrofit2.http.Query

interface RestoAPIService {
    @GET("restaurant_api.php")
    suspend fun getAllResto(): List<RestoData>

    @GET("restaurant_api.php")
    suspend fun getDetailResto(@Query("id") id: Int): RestoData
}