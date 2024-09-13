package com.example.appa.api

import androidx.compose.ui.unit.Constraints
import com.example.appa.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("/v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") country:String="us",
        @Query("page")pageNumber:Int=1,
        @Query("apiKey") apiKey:String= Constants.API_KEY
    )
}