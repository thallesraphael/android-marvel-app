package com.example.marvelapp.framework.network.response

import br.com.example.core.domain.model.Character

data class CharacterResponse(
    val id: Long,
    val name: String,
    val thumbnail: ThumbnailResponse
)
fun CharacterResponse.toCharacterModel(): Character {
    return Character(
        name = this.name,
        imageUrl = "${this.thumbnail.path}.${this.thumbnail.extension}"
    )
}