package com.gigaxysafe.attendxx.personalizeduser

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.ActivityPersonalizedUserBaseBinding
import com.gigaxysafe.attendxx.util.hideSystemBars
import com.google.android.gms.maps.SupportMapFragment

class PersonalizedUserBaseActivity : AppCompatActivity() {
    private var _binding: ActivityPersonalizedUserBaseBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPersonalizedUserBaseBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.PersonalizedUserBaseFragmentHost)
                    as NavHostFragment
        binding?.PersonalizedUserBottomNav?.setupWithNavController(navHostFragment.navController)
    }

    override fun onResume() {
        super.onResume()
        hideSystemBars(binding?.root as View)
    }
}