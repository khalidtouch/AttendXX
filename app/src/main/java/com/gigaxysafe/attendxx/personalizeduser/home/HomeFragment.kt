package com.gigaxysafe.attendxx.personalizeduser.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentHomeBinding
import com.gigaxysafe.attendxx.util.OnHandleScreenClicks

class HomeFragment : Fragment(R.layout.fragment_home), OnHandleScreenClicks {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
        onHandleScreenClicks()


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

    private fun onNavigateToTakeAttendance() {
        findNavController().navigate(R.id.action_homeFragment_to_takeAttendanceFragment)
    }

    private fun onNavigateToCreateOrganization() {
        findNavController().navigate(
            R.id.action_homeFragment_to_createOrganizationFragment
        )
    }

    override fun onHandleScreenClicks() {
        binding?.TakeYourAttendanceLayout?.setOnClickListener { onNavigateToTakeAttendance() }
        binding?.HomeActionCreateOrganization?.setOnClickListener { onNavigateToCreateOrganization() }
    }
}