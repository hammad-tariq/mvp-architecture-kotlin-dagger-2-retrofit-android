package com.es.developine.di.component

import com.es.developine.ApplicationClass
import com.es.developine.di.module.AppModule
import com.es.developine.di.module.NetModule
import com.es.developine.ui.login.LoginActivity
import com.es.developine.ui.login.LoginPresenterImpl
import com.es.developine.ui.posts.PostActivity
import com.es.developine.ui.posts.PostPresenterImpl
import dagger.Component

@Component(modules = [AppModule::class, NetModule::class])
interface ApplicationComponent {

    fun inject(mewApplication: ApplicationClass)
    fun inject(mLoginPresenterImpl: LoginPresenterImpl)
    fun inject(mLoginActivity: LoginActivity)
    fun inject(mPostPresenterImpl: PostPresenterImpl)

}