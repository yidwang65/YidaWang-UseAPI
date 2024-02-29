package com.bignerdranch.android.criminalintent

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    fun getPostById(@Query("category") category: String, @Query("apiKey") apikey: String): Call<NewsResponse>
}