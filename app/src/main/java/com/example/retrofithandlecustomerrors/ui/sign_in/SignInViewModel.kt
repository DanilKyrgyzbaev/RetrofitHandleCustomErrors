package com.example.retrofithandlecustomerrors.ui.sign_in

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofithandlecustomerrors.modelW.User
import com.example.retrofithandlecustomerrors.net_work_api.ApiService
import com.example.retrofithandlecustomerrors.net_work_api.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignInViewModel : ViewModel() {
    val errorHandle = MutableLiveData<String>()
    var api: ApiService = RetrofitClient().getApi()

    fun signIn(user: User) {
        api.login(user).enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.isSuccessful) {
                    Log.e("Successful", response.body()?.token.toString())
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                errorHandle.postValue(t.message)
                Log.e("onFailure", t.message.toString())
            }
        })
    }
}
