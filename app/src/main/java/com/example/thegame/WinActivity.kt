package com.example.thegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thegame.databinding.ActivityTieBinding
import com.example.thegame.databinding.ActivityWinBinding

private lateinit var binding: ActivityWinBinding

class WinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        binding = ActivityWinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.replay.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}