package com.example.danielpopovici.giftfinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessagingService
import kotlinx.android.synthetic.main.activity_wishlist.*

class WishlistActivity : AppCompatActivity() {

    val vpAdapter = WishlistViewPagerAdapter(this, supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishlist)

        title = "Gift finder"

        setupViewPager()

        Log.d("FCM_TOKEN:", FirebaseInstanceId.getInstance().token)
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
