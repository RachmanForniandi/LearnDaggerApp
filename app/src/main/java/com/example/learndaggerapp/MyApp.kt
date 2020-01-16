package com.example.learndaggerapp

import android.app.Application
import android.util.Log
import com.example.learndaggerapp.di.component.DaggerAppComponent
import com.example.learndaggerapp.di.module.AppModule

class MyApp:Application (){

    companion object {
        const val TAG ="MyApp"
    }
    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.builder().appModule(AppModule()).build()
        Log.d(TAG,appComponent.getAppLogger().value)
        Log.d(TAG,appComponent.getAppLogger().value)
        Log.d(TAG,appComponent.getAppLogger().value)
    }
}