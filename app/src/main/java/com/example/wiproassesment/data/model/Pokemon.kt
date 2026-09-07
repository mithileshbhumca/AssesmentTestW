package com.example.wiproassesment.data.model

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    @SerializedName("results") val results: List<Pokemon>
)

data class Pokemon(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
) {
    val imageUrl: String
        get() {
            val index = url.split("/").filter { it.isNotEmpty() }.last()
            return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$index.png"
        }
}
