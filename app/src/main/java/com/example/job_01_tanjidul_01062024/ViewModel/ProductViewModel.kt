package com.example.job_01_tanjidul_01062024.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.job_01_tanjidul_01062024.Api.ApiClient.apiService
import com.example.job_01_tanjidul_01062024.Product
import kotlinx.coroutines.launch

class ProductViewModel:ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private suspend fun fetchProducts() {
        try {
            val response = apiService.getProducts()
            _products.postValue(response)
        } catch (e: Exception) {
            // Handle error
        }
    }
}