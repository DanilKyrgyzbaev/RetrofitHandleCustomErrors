package com.example.retrofithandlecustomerrors.ui.sign_in

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.retrofithandlecustomerrors.databinding.ActivitySignInBinding
import com.example.retrofithandlecustomerrors.modelW.User
import com.example.retrofithandlecustomerrors.ui.MainActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    lateinit var viewModel: SignInViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(SignInViewModel::class.java)
        binding.btnEnter.setOnClickListener {
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            viewModel.signIn(User(email, password))
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
