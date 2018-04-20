package com.es.developine.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.provider.Settings
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import com.es.developine.R

abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayout())

    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        init(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        System.gc()
        System.runFinalization()
    }



    @LayoutRes
    abstract fun setLayout():Int
    abstract fun init(savedInstanceState: Bundle?)

}