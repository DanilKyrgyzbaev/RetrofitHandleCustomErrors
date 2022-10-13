package com.example.retrofithandlecustomerrors.repository

import com.example.retrofithandlecustomerrors.model.Child

interface ProfilesRepository {
    suspend fun getListProfileChild(): List<Child>
    suspend fun createProfileChild(child: Child): Child
}