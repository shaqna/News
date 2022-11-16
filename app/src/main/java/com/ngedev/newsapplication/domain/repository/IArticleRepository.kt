package com.ngedev.newsapplication.domain.repository

import androidx.paging.PagingData
import com.ngedev.newsapplication.data.source.local.entity.FavoriteEntity
import com.ngedev.newsapplication.domain.model.Article
import com.ngedev.newsapplication.ui.detail.BookmarkState
import kotlinx.coroutines.flow.Flow

interface IArticleRepository {
    fun getArticleRelateWith(query: String): Flow<PagingData<Article>>

    fun loadFavoriteArticles(): Flow<List<FavoriteEntity>>

    fun getArticleByTitle(title: String): Flow<BookmarkState<Article>>

    suspend fun insertFavoriteArticle(favoriteEntity: FavoriteEntity)

    suspend fun deleteFavoriteArticle(favoriteEntity: FavoriteEntity)
}