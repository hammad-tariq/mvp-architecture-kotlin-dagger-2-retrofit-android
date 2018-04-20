package com.es.developine.ui.login

import android.app.Application
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.es.developine.ApplicationClass
import com.es.developine.R
import com.es.developine.network.INetworkApi
import com.es.developine.ui.BaseActivity
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginView {

    lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        (application as ApplicationClass).applicationComponent.inject(this)
        loginPresenter = LoginPresenterImpl(this, application)
        loginPresenter.validateUser("hammad", "")

    }


    @Inject
    lateinit var mNetworkApi: INetworkApi

    lateinit var applicationComponent: Application

    override fun onPasswordError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBackPress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToHome() {
        Toast.makeText(this, "Hello MVP", Toast.LENGTH_SHORT).show()
    }
}
