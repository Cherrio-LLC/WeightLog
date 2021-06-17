package com.cherrio.signin.data.firebase

import android.content.Context
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

object FirebaseRepository {


    //Init Firebase App
    fun intFirebaseApp(context: Context){
        println("Application intFirebaseApp")
        FirebaseApp.initializeApp(context, FirebaseInit.options)
    }

    //Database node
     const val DATABASE_WEIGHTS = "Weights"



    // FirebaseAuth Object
     val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance(firebaseApp())

    // CurrentUser Object
    val currentUser: FirebaseUser? = firebaseAuth.currentUser



    // FirebaseApp for all things firebase
    private fun firebaseApp(): FirebaseApp{
        return FirebaseApp.getInstance()
    }

}