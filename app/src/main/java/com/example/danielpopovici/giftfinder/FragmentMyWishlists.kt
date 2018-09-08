package com.example.danielpopovici.giftfinder

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my_wishlists.view.*

class FragmentMyWishlists : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_my_wishlists, container, false)


        view.customRecommendation1.setProducts("Gadgets", getAllWishlistItems())
        view.customRecommendation2.setProducts("TVs", getAllWishlistItems())
        view.customRecommendation3.setProducts("", getAllWishlistItems())

        return view
    }

}