package com.example.retrofithandlecustomerrors.modelW

import com.google.gson.annotations.SerializedName

data class ResponseSucces(
    @SerializedName("statusCode")
    var statusCode: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("token")
    var token: String,

    @SerializedName("user")
    var user: User
)
