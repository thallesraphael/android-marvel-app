package br.com.example.core.usecase

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.example.core.data.repository.CharacterRepository
import br.com.example.core.domain.model.Character
import br.com.example.core.usecase.base.PagingUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val characterRepository: CharacterRepository
) : PagingUseCase<GetCharactersUseCase.GetCharactersParams, Character>() {

    data class GetCharactersParams(val query: String, val pagingConfig: PagingConfig)

    override fun createFlowObservable(params: GetCharactersParams): Flow<PagingData<Character>> {
        return Pager(config = params.pagingConfig) {
            characterRepository.getCharacters(params.query)
        }.flow
    }

}