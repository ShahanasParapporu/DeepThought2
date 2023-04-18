package com.example.deepthought.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: ProjectApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://dev.deepthought.education")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProjectApi::class.java)
    }
}