package com.es.developine

import android.app.Application
import com.es.developine.di.component.ApplicationComponent
import com.es.developine.di.component.DaggerApplicationComponent
import com.es.developine.di.module.AppModule
import com.es.developine.di.module.NetModule

open class ApplicationClass : Application() {


    public lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder()
                .netModule(NetModule())
                .build()

        applicationComponent.inject(this)
    }
}