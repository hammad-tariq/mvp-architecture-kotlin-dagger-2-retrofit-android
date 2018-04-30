package com.es.developine.ui.login

import android.widget.EditText
import com.es.developine.ui.IView

interface LoginView: IView {

    fun navigateToHome()

    fun onBackPress()

    fun onPasswordError()
}