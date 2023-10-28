package com.example.thegame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thegame.databinding.ActivityChoiceBinding.inflate
import com.example.thegame.databinding.ActivityTieBinding
import com.example.thegame.databinding.ActivityWinBinding.inflate


class TieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tie)

        binding = ActivityTieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.replay.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
    }
}