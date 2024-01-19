package com.example.marvelapp.presentation.favorites

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.example.core.domain.model.Character
import com.bumptech.glide.Glide
import com.example.marvelapp.R
import com.example.marvelapp.databinding.ItemFavoriteBinding

class FavoritesViewHolder(
    itemFavoriteBinding : ItemFavoriteBinding
) : ViewHolder(itemFavoriteBinding.root) {

    private val characterName = itemFavoriteBinding.characterName
    private val characterImage = itemFavoriteBinding.characterImage

    fun bind(character: Character) {
        characterName.text = character.name

        Glide.with(itemView)
            .load(character.imageUrl)
            .fallback(R.drawable.ic_img_loading_error)
            .into(characterImage)
    }
}