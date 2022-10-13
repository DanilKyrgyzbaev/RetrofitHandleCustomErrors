package com.example.retrofithandlecustomerrors.model

data class Exercise(
    val type: TypeExercise,
    val count: Int,
    val max: Int? = null
)