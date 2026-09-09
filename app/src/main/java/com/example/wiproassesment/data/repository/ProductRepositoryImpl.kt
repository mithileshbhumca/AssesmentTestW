package com.example.wiproassesment.data.repository

import com.example.wiproassesment.data.mapper.toDomain
import com.example.wiproassesment.data.remote.api.ProductApiService
import com.example.wiproassesment.domain.model.Product
import com.example.wiproassesment.domain.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val apiService: ProductApiService
) : ProductRepository {

    /*  override suspend fun getProducts(): Result<List<Product>> = runCatching {
          apiService.getProducts().products.map { it.toDomain() }
      }
  */
    //we can use above or below , both are fine

    override suspend fun getProducts(): Result<List<Product>> {
        return try {
            val response = apiService.getProducts().products.map {
                it.toDomain()
            }
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }

    }
}