package com.example.deepthought.API

import com.example.deepthought.model.JsonData
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ProjectApi {

    @GET("/assets/uploads/files/others/project.json")
    suspend fun getProjects(): Response<JsonData>


}