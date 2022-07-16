package com.gigaxysafe.attendxx.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentCreateAccountBinding
import com.gigaxysafe.attendxx.databinding.FragmentSignInBinding

class CreateAccountFragment : Fragment(R.layout.fragment_create_account) {
    private var _binding: FragmentCreateAccountBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCreateAccountBinding.bind(view)
        binding?.tvSignInInstead?.setOnClickListener {
            findNavController().navigate(
                R.id.action_createAccountFragment_to_signInFragment
            )
        }
    }
}