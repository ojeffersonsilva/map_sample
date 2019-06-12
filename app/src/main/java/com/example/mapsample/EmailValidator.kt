package com.example.mapsample

object EmailValidator {

    fun isValidEmail(email: String) = email.contains("@", false)

}