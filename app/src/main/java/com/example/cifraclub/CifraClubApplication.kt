package com.example.cifraclub

import android.app.Application
import com.example.cifraclub.data.AppContainer
import com.example.cifraclub.data.DefaultAppContainer

class CifraClubApplication: Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }

}