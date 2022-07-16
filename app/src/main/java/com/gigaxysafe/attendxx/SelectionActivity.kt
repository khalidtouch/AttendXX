package com.gigaxysafe.attendxx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gigaxysafe.attendxx.auth.AuthBaseActivity
import com.gigaxysafe.attendxx.databinding.ActivitySelectionBinding

class SelectionActivity : AppCompatActivity() {
    private var _binding: ActivitySelectionBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySelectionBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.PersonalizedBiometricLayout?.setOnClickListener {
            startActivity(Intent(this, AuthBaseActivity::class.java))
        }
    }
}