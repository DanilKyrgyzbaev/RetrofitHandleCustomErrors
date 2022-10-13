package com.example.retrofithandlecustomerrors.ui.registration

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofithandlecustomerrors.model.Registration
import com.example.retrofithandlecustomerrors.net_work_api.ApiService
import com.example.retrofithandlecustomerrors.net_work_api.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegistrationViewModel : ViewModel() {
    val errorHandle = MutableLiveData<String>()
    var api: ApiService = RetrofitClient().getApi()

    fun registration(registration: Registration) {
        api.postUserRegister(registration).enqueue(object : Callback<Registration> {
            override fun onResponse(call: Call<Registration>, response: Response<Registration>) {
                if (response.isSuccessful) {
                    Log.e("Successful", response.body().toString())
                } else {
                    Log.e("Error Successful", response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<Registration>, t: Throwable) {
                errorHandle.postValue(t.message)
                Log.e("onFailure", t.message.toString())
            }
        })
    }
}
