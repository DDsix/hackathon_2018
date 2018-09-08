package com.example.danielpopovici.giftfinder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_products_listing.*

/**
 * @author madalina.loghin on 9/8/2018.
 */
class ProductListingActivity : AppCompatActivity() {

    private lateinit var adapter: AdapterListingProductRecommendation

    companion object {
        private lateinit var productList: List<Product>

        fun launch(ctx: Context, list: List<Product>) {
            ctx.startActivity(Intent(ctx, ProductListingActivity::class.java))
            productList = list
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_listing)

        setupProductListing()
    }

    private fun setupProductListing() {
        adapter = AdapterListingProductRecommendation()
        adapter.setNewData(productList)
        rvProducts.layoutManager = LinearLayoutManager(baseContext, LinearLayoutManager.VERTICAL, false)
        rvProducts.adapter = adapter

    }
}