package com.example.danielpopovici.giftfinder

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_wishlist_listing.*

class WishlistListingActivity : AppCompatActivity() {

    companion object {
        fun launch(ctx: Context) {
            ctx.startActivity(Intent(ctx, WishlistListingActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishlist_listing)

        val fragment = FragmentMyWishlists()
        supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()

        title = "Wishlists"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            super.onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
