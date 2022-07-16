package com.gigaxysafe.attendxx.personalizeduser

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentBiometricInformationBinding
import com.gigaxysafe.attendxx.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
        binding?.TakeYourAttendanceLayout?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_takeAttendanceFragment)
        }

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: called")
    }

    override fun onDestroy() {
        _binding = null
        Log.i(TAG, "onDestroy: called")
        super.onDestroy()
    }

    companion object {
        val TAG = "HomeFragment"
    }
}