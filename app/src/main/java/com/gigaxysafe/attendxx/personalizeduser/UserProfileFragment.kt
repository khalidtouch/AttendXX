package com.gigaxysafe.attendxx.personalizeduser

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentBiometricInformationBinding
import com.gigaxysafe.attendxx.databinding.FragmentUserProfileBinding

class UserProfileFragment : Fragment(R.layout.fragment_user_profile) {
    private var _binding: FragmentUserProfileBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUserProfileBinding.bind(view)
    }
}