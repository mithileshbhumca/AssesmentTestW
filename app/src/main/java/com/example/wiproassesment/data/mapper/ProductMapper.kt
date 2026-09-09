package com.example.wiproassesment.data.mapper

import com.example.wiproassesment.data.remote.dto.ProductDto
import com.example.wiproassesment.domain.model.Product

fun ProductDto.toDomain(): Product {
    val product=Product(
        id=id,
        title=title,
        description=description,
        price=price
    )
    return product
}