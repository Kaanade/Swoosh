package com.example.matth.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.matth.swoosh.Model.Player
import com.example.matth.swoosh.R
import com.example.matth.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if(player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClicked(view: View){
        womenLeagueBtn.isChecked = false
        menLeagueBtn.isChecked = false

        player.league = "men"
    }

    fun onWomenClicked(view: View){
        menLeagueBtn.isChecked = false
        menLeagueBtn.isChecked = false

        player.league = "women"
    }

    fun onCoedClicked(view: View){
        womenLeagueBtn.isChecked = false
        menLeagueBtn.isChecked = false

        player.league = "coed"
    }

}
