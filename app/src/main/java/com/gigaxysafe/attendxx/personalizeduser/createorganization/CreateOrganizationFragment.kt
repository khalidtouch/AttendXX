package com.gigaxysafe.attendxx.personalizeduser.createorganization

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentCreateOrganizationBinding
import com.gigaxysafe.attendxx.databinding.FragmentHomeBinding
import com.gigaxysafe.attendxx.personalizeduser.PersonalizedUserBaseActivity
import com.gigaxysafe.attendxx.util.OnHandleScreenClicks

class CreateOrganizationFragment : Fragment(R.layout.fragment_create_organization),
    OnHandleScreenClicks {
    private var _binding: FragmentCreateOrganizationBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCreateOrganizationBinding.bind(view)
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

    override fun onHandleScreenClicks() {
        binding?.btnNext?.setOnClickListener { onNavigateToPage2() }
    }

    private fun onNavigateToPage2() {
        startActivity(
            Intent(
                (activity as PersonalizedUserBaseActivity),
                CreateOrganizationTwoActivity::class.java
            )
        )
    }
}