package com.gigaxysafe.attendxx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gigaxysafe.attendxx.databinding.ActivityMainBinding
import com.gigaxysafe.attendxx.util.hideSystemBars

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnGetStarted?.setOnClickListener {
            startActivity(Intent(this, SelectionActivity::class.java))
        }
    }


    override fun onResume() {
        super.onResume()
        hideSystemBars(binding?.root as View)
    }
}