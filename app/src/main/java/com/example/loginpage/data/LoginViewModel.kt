package com.example.loginpage.data

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var registrationUiState = mutableStateOf(RegistrationUiState())

    fun onEvent(event: UiEvents) {
        when (event) {
            is UiEvents.FirstNameChanged -> {
                registrationUiState.value = registrationUiState.value.copy(
                    firstName = event.firstName
                )

            }

            is UiEvents.LastNameChanged -> {
                registrationUiState.value = registrationUiState.value.copy(
                    firstName = event.lastName
                )
            }

            is UiEvents.EmailChanged -> {
                registrationUiState.value = registrationUiState.value.copy(
                    firstName = event.email
                )
            }

            is UiEvents.PasswordChanged -> {
                registrationUiState.value = registrationUiState.value.copy(
                    firstName = event.password
                )
            }

        }
    }
}