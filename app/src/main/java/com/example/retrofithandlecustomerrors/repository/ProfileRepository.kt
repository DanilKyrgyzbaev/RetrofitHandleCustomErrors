package com.example.retrofithandlecustomerrors.repository

import com.example.retrofithandlecustomerrors.model.Child
import com.example.retrofithandlecustomerrors.model.Role

interface ProfileRepository {
    var token: String?
    var role: Role?
    var child : Child?
    var email: String?
    var password: String?
    fun clear()
}