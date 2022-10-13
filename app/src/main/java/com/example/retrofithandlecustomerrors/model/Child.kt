package com.example.retrofithandlecustomerrors.model

import com.google.gson.annotations.SerializedName

data class Child(
    @SerializedName("fullName")
    var name: String = "",
    @SerializedName("sex")
    var gender: Gender = Gender.MAN,
    @SerializedName("age")
    var age: Int = 0,
    var isEngagedSports: Boolean = false,
    val id: String = "",
    val parentAccountId: String = ""
)