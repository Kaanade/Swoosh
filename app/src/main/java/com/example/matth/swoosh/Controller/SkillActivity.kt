package com.example.matth.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.matth.swoosh.Utilities.EXTRA_LEAGUE
import com.example.matth.swoosh.R
import com.example.matth.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onSkillFinishedClicked(view: View){
        if(skill != ""){
            val finishedActivity = Intent(this, FinishActivity::class.java)
            finishedActivity.putExtra(EXTRA_LEAGUE, league)
            finishedActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishedActivity)
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkilBtn.isChecked = false
        skill = "beginner"
    }
}
