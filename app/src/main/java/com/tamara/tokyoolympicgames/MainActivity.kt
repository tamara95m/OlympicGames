package com.tamara.tokyoolympicgames


import android.view.LayoutInflater
import com.tamara.tokyoolympicgames.data.DataManager
import com.tamara.tokyoolympicgames.databinding.ActivityMainBinding
import com.tamara.tokyoolympicgames.ui.GamesAdapter
import com.tamara.tokyoolympicgames.util.Constants
import com.tamara.tokyoolympicgames.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity :BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String ="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate




    private fun parseFile()
    {
        val inputStream=assets.open("tokyoGames")// access to the file
        val buffer= BufferedReader(InputStreamReader(inputStream))
        val parser =CsvParser()
        buffer.forEachLine {
        val currentgame =parser.parse(it)
          DataManager.addOlympicGames(currentgame)
        }
    }

    override fun setup() {
       parseFile()
        val adapter=GamesAdapter(DataManager.games)
        binding.recyclerGame.adapter=adapter
    }

    override fun addCallbacks() {
       // here we will add every thing binding.action ex
    }
}