package br.com.example.core.data.network.response

data class CharacterResponse(
    val id: Long,
    val name: String,
    val thumbnail: ThumbnailResponse
)
