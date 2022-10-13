package com.example.retrofithandlecustomerrors

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class App : Application() {
    lateinit var context: Context
    companion object {
        @SuppressLint("StaticFieldLeak")
        private var instance: App? = null
        fun getInstance(): App = instance!!
        lateinit var sheredPrefs: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()
        sheredPrefs = getSharedPreferences(" com.example.retrofithandlecustomerrors", Context.MODE_PRIVATE)
    }
}