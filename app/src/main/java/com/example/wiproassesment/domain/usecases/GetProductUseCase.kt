package com.example.wiproassesment.domain.usecases

import com.example.wiproassesment.domain.model.Product
import com.example.wiproassesment.domain.repository.ProductRepository
import javax.inject.Inject

class GetProductUseCase @Inject constructor(
    private val repository: ProductRepository
){
    suspend operator fun invoke(): Result<List<Product>>{
        return  repository.getProducts()
    }

}