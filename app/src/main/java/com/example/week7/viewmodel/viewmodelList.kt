package com.example.week7.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.week7.data.DataSource
import com.example.week7.model.RestoData
import com.example.week7.repository.RestoContainer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class viewmodelList: ViewModel() {
    private val _resto = MutableStateFlow<List<RestoData>>(emptyList())

    val resto: StateFlow<List<RestoData>> = _resto


    init {
        loadResto()
    }

    private fun loadResto() {
        viewModelScope.launch {
            val data = RestoContainer().restoRepository.getAllResto()
            _resto.value = data
        }
    }
}