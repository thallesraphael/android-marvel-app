package com.example.marvelapp.framework

import androidx.paging.PagingSource
import br.com.example.core.data.repository.CharacterRepository
import br.com.example.core.data.repository.CharactersRemoteDataSource
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val remoteDataSource: CharactersRemoteDataSource<DataWrapperResponse>
) : CharacterRepository {
    override fun getCharacters(query: String): PagingSource<Int, Character> {
        TODO("Not yet implemented")
    }
}