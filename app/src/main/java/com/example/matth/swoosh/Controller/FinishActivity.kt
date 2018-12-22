package com.example.matth.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.matth.swoosh.Model.Player
import com.example.matth.swoosh.R
import com.example.matth.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill } near you..."
    }
}
