package com.example.week7.repository

import com.example.week7.model.RestoData
import com.example.week7.service.RestoAPIService

class RestoRepository(private val restaurantAPIService: RestoAPIService) {
    suspend fun getAllResto(): List<RestoData> {
        return restaurantAPIService.getAllResto()
    }

    suspend fun getDetailResto(id: Int): RestoData {
        val respond = restaurantAPIService.getDetailResto(id)
        val restaurant = RestoData(
            id = respond.id,
            name = respond.name,
            rating = respond.rating,
            ratingCount = respond.ratingCount,
            distance = respond.distance,
            location = respond.location,
            description = respond.description
        )
        return restaurant
    }
}