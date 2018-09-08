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

        view.customRecommendation0.setProducts("All your favorite products", getAllWishlistItems())

        getSingleWishlistItems(0).apply {
            view.customRecommendation1.setProducts(name, products)
        }
        getSingleWishlistItems(1).apply {
            view.customRecommendation2.setProducts(name, products)
        }
        getSingleWishlistItems(2).apply {
            view.customRecommendation3.setProducts(name, products)
        }

        return view
    }

}