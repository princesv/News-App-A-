package com.example.appa.api

import androidx.compose.ui.unit.Constraints
import com.example.appa.pojo.NewsResponse
import com.example.appa.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("/v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") country: String="us",
        @Query("page") pageNo: Int=1,
        @Query("apiKey") apiKey: String=Constants.API_KEY
    ):Response<NewsResponse>

    @GET("/v2/everything")
    suspend fun searchForNews(
        @Query("q") searchText:String="",
        @Query("page") pageNo: Int=1,
        @Query("apiKey") apiKey: String=Constants.API_KEY
    )
}