package com.example.week7.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import com.example.week7.model.RestoData
import com.example.week7.repository.RestoContainer

class viewmodelDetail : ViewModel() {
    private val _restaurant = MutableStateFlow<RestoData>(RestoData())
    val restaurant: StateFlow<RestoData> = _restaurant

    fun setRestaurant(id: String) {
        viewModelScope.launch {
            val data = RestoContainer().restoRepository.getDetailResto(id.toInt())
            _restaurant.value = _restaurant.value.copy(
                data.id,
                data.name,
                data.rating,
                data.ratingCount,
                data.distance,
                data.location,
                data.description
            )
        }
    }
}