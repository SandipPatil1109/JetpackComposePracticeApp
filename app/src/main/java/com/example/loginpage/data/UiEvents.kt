package com.example.loginpage.data

sealed class UiEvents{
    data class FirstNameChanged(val firstName:String):UiEvents()
    data class LastNameChanged(val lastName:String):UiEvents()
    data class EmailChanged(val email:String):UiEvents()
    data class PasswordChanged(val password:String):UiEvents()
}
