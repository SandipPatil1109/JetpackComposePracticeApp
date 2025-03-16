package com.example.loginpage.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.loginpage.R
import com.example.loginpage.components.AccountClickabletext
import com.example.loginpage.components.HeadingTextComponents
import com.example.loginpage.components.MyTextField
import com.example.loginpage.components.NormalTextComponents
import com.example.loginpage.components.PasswordTextField
import com.example.loginpage.components.buttonComponent
import com.example.loginpage.components.checkBoxComponents
import com.example.loginpage.components.divierTextComponent
import com.example.loginpage.data.LoginViewModel
import com.example.loginpage.data.UiEvents
import com.example.loginpage.util.AppRouter
import com.example.loginpage.util.Screen

@Composable
fun SignUpScreen(loginViewModel: LoginViewModel = viewModel()) {

    Surface(
        color = Color.White, modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            NormalTextComponents(value = stringResource(id = R.string.Hello))
            HeadingTextComponents(value = stringResource(id = R.string.textAccount))
            Spacer(modifier = Modifier.height(50.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.textFirstName),
                Icons.Outlined.Person
            ) {
                loginViewModel.onEvent(UiEvents.FirstNameChanged(it))
            }
            MyTextField(
                labelValue = stringResource(id = R.string.textLastName),
                Icons.Outlined.Person
            ) {
                loginViewModel.onEvent(UiEvents.LastNameChanged(it))
            }
            MyTextField(
                labelValue = stringResource(id = R.string.textEmail),
                Icons.Outlined.Email
            ) {
                loginViewModel.onEvent(UiEvents.EmailChanged(it))
            }
            PasswordTextField(
                labelValue = stringResource(id = R.string.textPassword),
                Icons.Default.Lock
            ) {
                loginViewModel.onEvent(UiEvents.PasswordChanged(it))
            }
            checkBoxComponents(value = stringResource(id = R.string.termsandConditions)) {
                AppRouter.navigateTo(Screen.TermsAndConditionsScreen)
            }
            Spacer(modifier = Modifier.height(40.dp))

            buttonComponent(value = stringResource(id = R.string.textRegister))
            Spacer(modifier = Modifier.height(20.dp))
            divierTextComponent()
            Spacer(modifier = Modifier.height(40.dp))
            AccountClickabletext(true) {
                AppRouter.navigateTo(Screen.LoginScreen)
            }

        }

    }

}
