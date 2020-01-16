package com.example.learndaggerapp.di.component

import com.example.learndaggerapp.MainActivity
import com.example.learndaggerapp.di.HttpService
import com.example.learndaggerapp.di.LoginManager
import com.example.learndaggerapp.di.module.HttpServiceModule
import com.example.learndaggerapp.di.module.LocalStoreModule
import dagger.Component

@Component(modules = [LocalStoreModule::class,HttpServiceModule::class])
interface LoginComponent {
    fun inject(mainActivity: MainActivity)


}