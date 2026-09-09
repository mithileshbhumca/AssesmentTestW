package com.example.wiproassesment.di

import com.example.wiproassesment.data.repository.ProductRepositoryImpl
import com.example.wiproassesment.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract  class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindProductRepository(
        repositoryImp: ProductRepositoryImpl
    ): ProductRepository

}