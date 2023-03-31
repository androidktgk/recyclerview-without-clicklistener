package com.govind8061.vidone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter(private val playersList: ArrayList<Players>):
    RecyclerView.Adapter<PlayerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val playerImg: ImageView =itemView.findViewById(R.id.imgPlayer)
        val playerName: TextView =itemView.findViewById(R.id.tvPlayerName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.players_list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return playersList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=playersList[position]
        holder.playerImg.setImageResource(currentItem.playerImg)
        holder.playerName.text = currentItem.playerName

    }
}