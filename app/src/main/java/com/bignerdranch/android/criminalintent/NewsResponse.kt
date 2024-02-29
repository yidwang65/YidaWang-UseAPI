package com.bignerdranch.android.criminalintent

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<News>
)
