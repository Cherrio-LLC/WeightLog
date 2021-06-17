package com.cherrio.signin.ui.signin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cherrio.signin.data.firebase.FirebaseRepository
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

/*
* Created by Ayodele on 05/06/2021
* Email: jazzedayo@gmail.com
* Abuja, NIGERIA
*/

class SignInViewModel: ViewModel() {
    private val _authState = MutableLiveData<Boolean>()
    val authState: LiveData<Boolean> get() = _authState

    fun signInWithGoogle(){
        FirebaseRepository.firebaseAuth.signInAnonymously().addOnCompleteListener { task ->
            _authState.value = task.isSuccessful
        }
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("token")
            .requestEmail()
            .build()
    }
}