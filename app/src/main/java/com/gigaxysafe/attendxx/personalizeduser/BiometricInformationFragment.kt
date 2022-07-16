package com.gigaxysafe.attendxx.personalizeduser

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentBiometricInformationBinding

class BiometricInformationFragment : Fragment(R.layout.fragment_biometric_information) {
    private var _binding: FragmentBiometricInformationBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBiometricInformationBinding.bind(view)
    }
}