package com.example.retrofithandlecustomerrors.model

data class User(
    val email: String,
    val password: String,
    val token: String? = null
)
