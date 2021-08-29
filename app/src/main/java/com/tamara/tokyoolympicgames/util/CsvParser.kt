package com.tamara.tokyoolympicgames.util

import com.tamara.tokyoolympicgames.OlympicGames

class CsvParser {
    fun parse(line:String): OlympicGames
    {

        val tokens =line.split(",")
        return OlympicGames(//rank = tokens[Constants.ColumnIndex.RANK].toInt(),
            team = tokens[Constants.ColumnIndex.TEAM],
            goldMedal= tokens[Constants.ColumnIndex.GOLD_MEDAL].toInt(),
            silverMedal= tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal= tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt())
//            totalMedalsOfTeam= tokens[Constants.ColumnIndex.TOTAL_MEDALS].toInt(),
//            rankByTotal= tokens[Constants.ColumnIndex.RANK_BY_TOTAL].toInt(),
//                    NOCCode=tokens[Constants.ColumnIndex.NOC_CODE]


    }
}