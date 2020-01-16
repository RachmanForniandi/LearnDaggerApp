package com.example.learndaggerapp.di.module

import com.example.learndaggerapp.di.AppLogger
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    private var index =0

    @Provides
    fun provideApiLogger():AppLogger{
        index++
        return AppLogger("App Logger Index: $index")
    }
}