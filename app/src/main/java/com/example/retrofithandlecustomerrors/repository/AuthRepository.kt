package com.example.retrofithandlecustomerrors.repository

interface AuthRepository {
    suspend fun signIn(email: String, password: String): String
    suspend fun signUp(email: String, password: String, age: Byte): String
}
