package com.bignerdranch.android.criminalintent

import android.util.Log
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CrimeListViewModel : ViewModel() {
    private val TAG = "CrimeListViewModel"
    val news = mutableListOf<News>()
    init{
        val category = "business" // Replace with the desired category
        val apikey = "7afd368e8e4e4da797bbb4943f877883"
        val call = ApiClient.apiService.getPostById(category, apikey)

        call.enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    val totalResults = response.body()!!.totalResults
                    Log.d(TAG, post)

                } else {
                    // Handle error
                    Log.d(TAG, "fail")
                }
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                // Handle failure
            }
        })
    }


}
