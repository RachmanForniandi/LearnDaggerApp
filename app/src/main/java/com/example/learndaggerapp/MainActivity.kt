package com.example.learndaggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndaggerapp.di.component.DaggerLoginComponent
import com.example.learndaggerapp.di.ApiService
import com.example.learndaggerapp.di.LocalStore
import com.example.learndaggerapp.di.LoginManager
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var loginManager: LoginManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val localStore = LocalStore()
        val apiService = ApiService()*/

        //val loginManager = LoginManager(localStore,apiService)
        val loginComponent = DaggerLoginComponent.create()
        loginComponent.inject(this)
        //loginManager.login("forniandi","123")
        loginManager.login("forniandi","123")
    }
}
