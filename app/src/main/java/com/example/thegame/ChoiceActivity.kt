package com.example.thegame

import Choice
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thegame.databinding.ActivityChoiceBinding
import com.example.thegame.databinding.ActivityMainBinding
import java.util.*
import kotlin.random.Random.Default.nextInt

class ChoiceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChoiceBinding
    private var game: Game = Game()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        binding = ActivityChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rock.setOnClickListener {
            theGame(Choice.rock)
        }
        binding.paper.setOnClickListener {
            theGame(Choice.paper)
        }
        binding.scissors.setOnClickListener {
            theGame(Choice.scissors)
        }
    }

    private fun theGame(playerChoice: Choice) {
        val status = game.theGame(playerChoice)
        if (status == Status.Win) {
            startActivity(Intent(this, WinActivity::class.java))
        } else if (status == Status.Lose) {
            startActivity(Intent(this, LoseActivity::class.java))
        } else {
            startActivity(Intent(this, TieActivity::class.java))
        }
    }

}