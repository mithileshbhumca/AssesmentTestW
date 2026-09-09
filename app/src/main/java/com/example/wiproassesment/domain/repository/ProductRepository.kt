package com.example.wiproassesment.domain.repository

import com.example.wiproassesment.domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): Result<List<Product>>
}