package com.example.wiproassesment.ui.products

import com.example.wiproassesment.domain.model.Product

sealed interface ProductUiState {
    data object Loading : ProductUiState
    data class Success(val products: List<Product>) : ProductUiState
    data class Error(val message: String) : ProductUiState
}