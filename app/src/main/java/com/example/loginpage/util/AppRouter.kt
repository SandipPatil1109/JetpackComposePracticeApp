package com.example.loginpage.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

sealed class Screen() {

    object SignupScreen:Screen()
    object TermsAndConditionsScreen:Screen()
    object LoginScreen:Screen()
}

object AppRouter{
    var currentScreen = mutableStateOf<Screen>(Screen.SignupScreen)

    fun navigateTo(destination:Screen){
         currentScreen.value =destination
    }
}

