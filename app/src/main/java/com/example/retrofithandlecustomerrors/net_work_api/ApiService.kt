package com.example.retrofithandlecustomerrors.net_work_api

import com.example.retrofithandlecustomerrors.model.Registration
import com.example.retrofithandlecustomerrors.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/auth/login")
    fun login(@Body user: User): Call<User>

    @POST("/auth/registration")
    fun postUserRegister(@Body registration: Registration): Call<Registration>
}