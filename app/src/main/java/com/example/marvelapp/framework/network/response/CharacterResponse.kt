package com.example.marvelapp.framework.network.response

data class CharacterResponse(
    val id: Long,
    val name: String,
    val thumbnail: ThumbnailResponse
)
