package com.example.wiproassesment.data.remote.api

import com.example.wiproassesment.data.remote.dto.ProductResponse
import retrofit2.http.GET

interface ProductApiService {

    @GET("products")
    suspend fun getProducts(): ProductResponse

}