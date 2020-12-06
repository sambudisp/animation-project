package com.sambudisp.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.sambudisp.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.flFragment.visibility = View.GONE

        binding.tvHelloWorld.apply {
            slideUp(1500L, 0L)
            Handler().postDelayed({
                fadeOut(1000L, 0L)
                visibility = View.GONE
            }, 1500)
        }

        Handler().postDelayed({
            binding.flFragment.visibility = View.VISIBLE
            binding.flFragment.slideUp(1000L, 0L)
        },2500)
    }
}