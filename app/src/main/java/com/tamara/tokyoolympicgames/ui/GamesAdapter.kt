package com.tamara.tokyoolympicgames.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tamara.tokyoolympicgames.OlympicGames
import androidx.recyclerview.widget.RecyclerView
import com.tamara.tokyoolympicgames.R
import com.tamara.tokyoolympicgames.databinding.GameItemBinding

class GamesAdapter (val list :MutableList<OlympicGames>) : RecyclerView.Adapter<GamesAdapter.OlympicGamesViewHolder>() {


// class of view Holder
    class OlympicGamesViewHolder(viewItem : View):RecyclerView.ViewHolder(viewItem)
    {
val binding= GameItemBinding.bind(viewItem)
    }
/////////////
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OlympicGamesViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.game_item,parent,false)
        return OlympicGamesViewHolder(view)
    }
//////////////////
    override fun onBindViewHolder(holder: OlympicGamesViewHolder, position: Int) {
        val currentGame=list[position]
       holder.binding.apply{
textTeam.text=currentGame.team
           goldMedalView.text=currentGame.goldMedal.toString()
           silverMedalView.text=currentGame.silverMedal.toString()
           bronzeMedalView.text=currentGame.bronzeMedal.toString()


       }
    }

    override fun getItemCount()= list.size



}