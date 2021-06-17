package com.cherrio.signin

import android.app.Application
import com.cherrio.signin.data.firebase.FirebaseInit
import com.google.firebase.FirebaseApp

/*
* Created by Ayodele on 05/06/2021
* Email: jazzedayo@gmail.com
* Abuja, NIGERIA
*/

class SignInApp: Application() {

    override fun onCreate() {
        super.onCreate()
        println("Application onCreate")
        FirebaseApp.initializeApp(this, FirebaseInit.options)
    }
}