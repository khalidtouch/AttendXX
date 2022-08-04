package com.gigaxysafe.attendxx.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.ActivityAuthBaseBinding
import com.gigaxysafe.attendxx.util.hideSystemBars

class AuthBaseActivity : AppCompatActivity() {
    private var _binding: ActivityAuthBaseBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAuthBaseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.AuthBaseFragmentHost)
                as NavHostFragment

    }

    override fun onResume() {
        super.onResume()
        hideSystemBars(binding?.root as View)
    }
}