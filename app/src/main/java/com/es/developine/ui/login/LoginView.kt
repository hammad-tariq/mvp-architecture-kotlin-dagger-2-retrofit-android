package com.es.developine.ui.login

import android.widget.EditText

interface LoginView {

    fun navigateToHome()

    fun onBackPress()

    fun onPasswordError()
}