package com.tamara.tokyoolympicgames


import android.view.LayoutInflater
import com.tamara.tokyoolympicgames.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity :BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String ="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate




    private fun openFile()
    {
        val inputStream=assets.open("tokyoGames.csv")// access to the file
        val buffer= BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {

           log(it)
        }
    }

    override fun setup() {
       openFile()
    }

    override fun addCallbacks() {
       // here we will add every thing binding.action ex
    }
}