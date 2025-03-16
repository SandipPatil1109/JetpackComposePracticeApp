package com.example.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginpage.Screens.SignUpScreen
import com.example.loginpage.Screens.TermsAndCondtionsScreen
import com.example.loginpage.app.postOfficeApp
import com.example.loginpage.ui.theme.LoginPageTheme
import com.example.loginpage.util.AppRouter
import com.example.loginpage.util.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          postOfficeApp()
        }
    }
}

//@Composable
//fun postOfficeApp(){
//    val currentScreen by AppRouter.currenScreen
//
//    when (currentScreen) {
//        is Screen.SignupScreen -> SignUpScreen()
//        is Screen.TermsAndConditionsScreen -> TermsAndCondtionsScreen()
//    }
//}
