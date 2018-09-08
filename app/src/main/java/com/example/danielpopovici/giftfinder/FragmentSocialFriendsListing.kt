package com.example.danielpopovici.giftfinder

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentSocialFriendsListing : Fragment() {

    private val friendsAdapter = WishlistSocialFriendsAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_social_friends_listing, container, false)
        setupFriendsRV()
        return view
    }

    private fun setupFriendsRV() {

    }

}