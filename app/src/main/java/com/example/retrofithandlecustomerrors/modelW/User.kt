package com.example.retrofithandlecustomerrors.modelW

data class User(
    val email: String,
    val password: String,
    val token: String? = null
)
