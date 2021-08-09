package com.androiddevs.newsApp.models

import com.androiddevs.newsApp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)