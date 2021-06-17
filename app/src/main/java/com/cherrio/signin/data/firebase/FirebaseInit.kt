package com.cherrio.signin.data.firebase

import com.google.firebase.FirebaseOptions

internal object FirebaseInit {
    /*
     * Firebase Options Builder
     */
    val options = FirebaseOptions.Builder()
        .setProjectId("gossip-the-app")
        .setApplicationId("1:415018823287:android:14c2bb8e871303e98d6072")
        .setApiKey("AIzaSyDBqAjoGyZABFm3NdV3qkIWQBYVXJ-CAuk")
        .setDatabaseUrl("https://gossip-the-app-default-rtdb.firebaseio.com")
        .setStorageBucket("gossip-the-app.appspot.com")
        .build()
}