package com.example.wiproassesment.data.remote

import com.example.wiproassesment.data.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApi {
    @GET("pokemon")
    suspend fun getPokemon(
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 10
    ): PokemonResponse

    companion object {
        const val BASE_URL = "https://pokeapi.co/api/v2/"
    }
}
