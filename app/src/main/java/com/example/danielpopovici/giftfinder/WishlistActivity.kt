package com.example.danielpopovici.giftfinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.content.ContextCompat
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import kotlinx.android.synthetic.main.activity_wishlist.*
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings


class WishlistActivity : AppCompatActivity() {

    val vpAdapter = WishlistViewPagerAdapter(this, supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishlist)

        title = "Gift finder"

        setupViewPager()
    }

    private fun setupViewPager() {
        vpWishlist.adapter = vpAdapter
        tlWishlist.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))
        tlWishlist.setTabTextColors(ContextCompat.getColor(this, R.color.light_blue),
                ContextCompat.getColor(this, R.color.white))
        tlWishlist.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.white))
        tlWishlist.setupWithViewPager(vpWishlist)
    }
}
