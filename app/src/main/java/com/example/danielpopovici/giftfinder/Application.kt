package com.example.danielpopovici.giftfinder

import android.app.Application
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        fetchRemoteConfig()

        FirebaseInstanceId.getInstance()?.token?.let {
            Log.d("FCM_TOKEN:", it)
        }
    }

    fun fetchRemoteConfig() {
        val remoteConfig = FirebaseRemoteConfig.getInstance()
        val configSettings = FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build()
        remoteConfig.setConfigSettings(configSettings)
        remoteConfig.setDefaults(R.xml.remote_config_defaults)
        remoteConfig.fetch(0).addOnCompleteListener {
            if (it.isSuccessful) {
                remoteConfig.activateFetched()
                Log.d("ttt:", FirebaseRemoteConfig.getInstance().getBoolean("is_delivery_estimate_enabled").toString())
            }
        }
    }

}