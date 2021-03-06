package com.example.danielpopovici.giftfinder

import android.graphics.Paint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_recommendation_product.view.*

class AdapterProductRecommendation : RecyclerView.Adapter<AdapterProductRecommendation.ViewHolder>() {

    var data: List<Product> = mutableListOf()

    fun setNewData(data: List<Product>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recommendation_product, parent, false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        init {

        }

        fun bind(item: Product) {
            Glide.with(itemView.context).load(item.photoUrl).into(itemView.ivProductImage)
            itemView.tvRecommendationTitle.text = item.name
            itemView.tvRecommentationPrice.text = "${item.price} RON"
            itemView.tvRecommentationOldPrice.apply {
                paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                text = "${item.oldPrice} RON"
            }

        }
    }

}