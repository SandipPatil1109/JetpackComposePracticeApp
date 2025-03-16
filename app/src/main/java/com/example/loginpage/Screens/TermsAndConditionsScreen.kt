package com.example.loginpage.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.loginpage.R
import com.example.loginpage.components.HeadingTextComponents
import androidx.activity.compose.BackHandler
import com.example.loginpage.util.AppRouter
import com.example.loginpage.util.Screen


@Composable
fun TermsAndCondtionsScreen(){

    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(16.dp)) {

        HeadingTextComponents(value = stringResource(id = R.string.termsandConditionsDetails))
    }
    BackHandler {
        AppRouter.navigateTo(Screen.SignupScreen)
    }

}