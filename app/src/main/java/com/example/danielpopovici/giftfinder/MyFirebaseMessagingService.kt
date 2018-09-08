package com.example.danielpopovici.giftfinder

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String?) {
        Log.d("FCM_TOKEN:", token)
    }

}