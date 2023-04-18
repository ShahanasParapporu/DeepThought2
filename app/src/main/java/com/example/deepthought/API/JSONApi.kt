/*package com.example.deepthought.API

import com.example.deepthought.model.JsonData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

const val BASE_URL = "https://dev.deepthought.education/assets/uploads/files/others/"

interface JSONApi {

    @GET("JsonData")
    fun getJSONData(): Call<List<JsonData>>

    companion object{

        operator fun invoke(): JSONApi{
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(JSONApi::class.java)
        }
    }
}*/