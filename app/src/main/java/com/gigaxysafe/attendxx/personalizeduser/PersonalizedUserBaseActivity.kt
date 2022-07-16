package com.gigaxysafe.attendxx.personalizeduser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gigaxysafe.attendxx.databinding.ActivityPersonalizedUserBaseBinding

class PersonalizedUserBaseActivity : AppCompatActivity() {
    private var _binding: ActivityPersonalizedUserBaseBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPersonalizedUserBaseBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}