package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// Retrofit instance (Singleton)
private val retrofit: Retrofit = Retrofit.Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1/") // Fixed base URL
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}



