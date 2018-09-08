package com.example.danielpopovici.giftfinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class WishlistActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishlist)

        supportActionBar?.title = "Gift finder"
    }
}
