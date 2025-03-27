package com.arwin.githubuser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arwin.githubuser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.customToolbar.apply {
            setTitle("Home")
            showBackButton(false)
            showCloseButton(false)
        }

    }
}