package com.example.learndaggerapp.di.component

import com.example.learndaggerapp.MainActivity
import com.example.learndaggerapp.di.LoginManager
import dagger.Component

@Component
interface LoginComponent {
    fun inject(mainActivity: MainActivity)


}