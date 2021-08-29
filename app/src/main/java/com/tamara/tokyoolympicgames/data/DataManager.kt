package com.tamara.tokyoolympicgames.data

import com.tamara.tokyoolympicgames.OlympicGames

object DataManager {
     val gamesList= mutableListOf<OlympicGames>()
private val gameIndex=0
    val games :List<OlympicGames>
        get() = gamesList

    fun addOlympicGames(game:OlympicGames)
    {

       gamesList.add(game)
    }
    fun getCurrentGame():OlympicGames= gamesList[gameIndex]
}