package com.example.retrofithandlecustomerrors.local

import com.example.retrofithandlecustomerrors.App

object Pref {
    private val sheredPreferences
        get() = App.sheredPrefs

    var userId: Int
        get() = sheredPreferences.getInt("id", 0)
        set(value) = sheredPreferences.edit().putInt("id", value).apply()

    var userToken: String
        get() = sheredPreferences.getString("userToken", "").toString()
        set(value) = sheredPreferences.edit().putString("userToken", value).apply()
}
