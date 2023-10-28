package com.example.thegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thegame.databinding.ActivityLoseBinding
import com.example.thegame.databinding.ActivityTieBinding
private lateinit var binding: ActivityLoseBinding

class LoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)

        binding = ActivityLoseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.replay.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

    }
}
}