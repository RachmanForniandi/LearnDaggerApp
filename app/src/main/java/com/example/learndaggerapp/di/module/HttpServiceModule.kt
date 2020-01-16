package com.example.learndaggerapp.di.module

import com.example.learndaggerapp.di.ApiService
import com.example.learndaggerapp.di.HttpService
import com.example.learndaggerapp.di.LocalStore
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class HttpServiceModule {

    @Binds
    abstract fun bindApiService(httpService: HttpService):ApiService

}