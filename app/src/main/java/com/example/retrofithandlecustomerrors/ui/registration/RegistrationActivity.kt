package com.example.retrofithandlecustomerrors.ui.registration

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.retrofithandlecustomerrors.databinding.ActivityRegistrationBinding
import com.example.retrofithandlecustomerrors.model.Registration
import com.example.retrofithandlecustomerrors.ui.MainActivity

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    lateinit var viewModel: RegistrationViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)
        binding.registerButton.setOnClickListener {
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            val age = binding.childAge.text.toString()
            viewModel.registration(Registration(email, password, age.toInt()))
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
