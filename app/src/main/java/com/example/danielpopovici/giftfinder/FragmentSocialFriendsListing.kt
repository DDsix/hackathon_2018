package com.example.danielpopovici.giftfinder

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_social_friends_listing.view.*

class FragmentSocialFriendsListing : Fragment() {

    private val friendsAdapter = WishlistSocialFriendsAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_social_friends_listing, container, false)

        view.rvWishlistSocialFriends.apply {
            adapter = friendsAdapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(ItemDecorator(30))
        }


        friendsAdapter.setNewData(getFacebookFriends())
        return view
    }

}