package com.example.loginpage.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginpage.Screens.LoginScreen
import com.example.loginpage.Screens.SignUpScreen
import com.example.loginpage.Screens.TermsAndCondtionsScreen
import com.example.loginpage.util.AppRouter
import com.example.loginpage.util.Screen

@Composable
fun postOfficeApp() {
    Surface(
        color = Color.White, modifier = Modifier
            .fillMaxSize()
    ) {
        Crossfade(targetState = AppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignupScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndCondtionsScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()
                }
            }
        }
    }

}


@Preview
@Composable
fun postOfficeAppPreview() {
    postOfficeApp()
}