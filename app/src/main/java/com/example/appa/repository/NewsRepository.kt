package com.example.appa.repository

import com.example.appa.api.RetrofitInstance
import com.example.appa.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String,pageNumber: Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}