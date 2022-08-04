package com.gigaxysafe.attendxx.personalizeduser.history

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentBiometricInformationBinding
import com.gigaxysafe.attendxx.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment(R.layout.fragment_history) {
    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHistoryBinding.bind(view)
    }
}