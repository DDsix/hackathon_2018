package com.example.danielpopovici.giftfinder

/**
 * @author madalina.loghin on 9/8/2018.
 */
class Product(val id: Int,
              val name: String,
              val photoUrl: String,
              val price: Double,
              val oldPrice: Double,
              val deliveryEstimation: String? = null)