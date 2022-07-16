package com.gigaxysafe.attendxx.auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.FragmentSignInBinding
import com.gigaxysafe.attendxx.personalizeduser.PersonalizedUserBaseActivity


class SignInFragment : Fragment(R.layout.fragment_sign_in) {
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignInBinding.bind(view)
        binding?.tvCreateAccountInstead?.setOnClickListener {
            findNavController().navigate(
                R.id.action_signInFragment_to_createAccountFragment
            )
        }
        binding?.btnSignIn?.setOnClickListener {
            startActivity(Intent(activity, PersonalizedUserBaseActivity::class.java))
        }
    }
}