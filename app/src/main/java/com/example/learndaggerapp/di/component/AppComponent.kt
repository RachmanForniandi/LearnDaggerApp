package com.example.learndaggerapp.di.component

import com.example.learndaggerapp.di.AppLogger
import com.example.learndaggerapp.di.module.AppModule
import dagger.Component
import dagger.Module

@Component(modules=[AppModule::class])
interface AppComponent {
    fun getAppLogger():AppLogger
}