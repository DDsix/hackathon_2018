package com.example.danielpopovici.giftfinder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_category.view.*

class AdapterCategoriesRecommendation : RecyclerView.Adapter<AdapterCategoriesRecommendation.ViewHolder>() {

    var data: List<Category> = mutableListOf()

    fun setNewData(data: List<Category>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
    )

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        init {

        }

        fun bind(item: Category) {
            Glide.with(itemView.context).load(item.photoUrl).into(itemView.ivCategoryIcon)
            itemView.tvCategoryName.text = item.name
        }

    }

}