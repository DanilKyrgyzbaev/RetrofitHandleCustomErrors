package com.example.retrofithandlecustomerrors.modelW

data class Registration(
    val email: String,
    val password: String,
    val age: Int,
    var token: String? = null

)