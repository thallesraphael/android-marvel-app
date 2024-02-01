package br.com.example.core.data.repository

import androidx.paging.PagingSource
import br.com.example.core.domain.model.Character

interface CharacterRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>
}