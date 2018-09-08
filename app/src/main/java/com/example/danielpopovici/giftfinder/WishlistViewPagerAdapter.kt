package com.example.danielpopovici.giftfinder

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.danielpopovici.giftfinder.FragmentMyWishlists
import com.example.danielpopovici.giftfinder.FragmentSocialFriendsListing

class WishlistViewPagerAdapter(private val ctx: Context,
                               private val fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int) = when (position) {
        0 -> FragmentMyWishlists()
        else -> FragmentSocialFriendsListing()
    }

    override fun getCount() = 2

    override fun getPageTitle(position: Int) = when (position) {
        0 -> "My wishlists"
        else -> "My friends wishlists"
    }

}