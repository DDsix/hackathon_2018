package com.example.danielpopovici.giftfinder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_wishlist_social_friend.view.*

class WishlistSocialFriendsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_GIFT_RECOMMENDATION = 0
        const val VIEW_TYPE_FRIEND_ITEM = 1
    }

    var data: List<SocialFriend>

    init {
        data = listOf()
    }

    fun setNewData(data: List<SocialFriend>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int) = when (position) {
        0 -> VIEW_TYPE_GIFT_RECOMMENDATION
        else -> VIEW_TYPE_FRIEND_ITEM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {
        VIEW_TYPE_GIFT_RECOMMENDATION -> GiftRecommendationViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_wishlist_gift_recommendation, parent, false))
        else -> ViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_wishlist_social_friend, parent, false))
    }


    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolder -> holder.bind(data[position])
            is GiftRecommendationViewHolder -> {
            }
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: SocialFriend) {
            itemView.tvName.text = item.name
            Glide.with(itemView.context).load(item.photoUrl).into(itemView.ivAvatar)
            itemView.tvWishlists.text = "${item.noOfWishlists}  public wishlists"

            itemView.setOnClickListener {
                WishlistListingActivity.launch(it.context)
            }
        }

    }

    class GiftRecommendationViewHolder(view: View) : RecyclerView.ViewHolder(view)

}