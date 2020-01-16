package com.example.learndaggerapp.di.module

import com.example.learndaggerapp.di.LocalStore
import dagger.Module
import dagger.Provides

@Module
class LocalStoreModule {

    @Provides
    fun provideLocalStore()=LocalStore()
}