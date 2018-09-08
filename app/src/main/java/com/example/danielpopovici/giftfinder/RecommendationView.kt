package com.example.danielpopovici.giftfinder

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.item_recommentation.view.*

class RecommendationView(ctx: Context, attrs: AttributeSet, defStyleAttr: Int) : CardView(ctx, attrs, defStyleAttr) {

    private lateinit var adapter: AdapterProductRecommendation

    init {
        radius = 0f
        setBackgroundColor(resources.getColor(R.color.white))

        val view = LayoutInflater.from(ctx).inflate(R.layout.item_recommentation, this, false)

        setupProductsListing(view)

        addView(view)
    }

    private fun setupProductsListing(view: View) {
        adapter = AdapterProductRecommendation()
        view.rvRecommendationProducts.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        view.rvRecommendationProducts.adapter = adapter
    }

}