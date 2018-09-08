package com.example.danielpopovici.giftfinder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_wishlist_social_friend.view.*

class WishlistSocialFriendsAdapter : RecyclerView.Adapter<WishlistSocialFriendsAdapter.ViewHolder>() {

    var data: List<SocialFriend>

    init {
        data = listOf()
    }

    fun setNewData(data: List<SocialFriend>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_wishlist_social_friend, parent, false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
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

}