package com.cherrio.signin.utils

import android.view.View

/*
* Created by Ayodele on 03/06/2021
* Email: jazzedayo@gmail.com
* Abuja, NIGERIA
*/

fun View.hide(){
    visibility = View.GONE
}
fun View.show(){
    visibility = View.VISIBLE
}
fun View.enable(){
    isEnabled = true
}
fun View.disable(){
    isEnabled = false
}


