package com.example.danielpopovici.giftfinder

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.item_recommentation.view.*

class GiftFinderView @JvmOverloads constructor(ctx: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : CardView(ctx, attrs, defStyleAttr) {

    private lateinit var adapter: AdapterCategoriesRecommendation

    init {
        radius = 0f
        setBackgroundColor(resources.getColor(R.color.white))

        val view = LayoutInflater.from(ctx).inflate(R.layout.item_gift_finder, this, false)

        setupCategoriesListing(view)

        addView(view)
    }

    private fun setupCategoriesListing(view: View) {
        adapter = AdapterCategoriesRecommendation()
        view.rvRecommendationProducts.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        view.rvRecommendationProducts.adapter = adapter
        adapter.setNewData(getCategories())
    }

}