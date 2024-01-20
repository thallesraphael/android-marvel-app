package br.com.example.core.data.repository

import androidx.paging.PagingSource

interface CharacterRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>
}