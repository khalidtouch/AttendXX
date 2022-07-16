package com.gigaxysafe.attendxx.personalizeduser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.gigaxysafe.attendxx.R

import com.google.android.material.bottomsheet.BottomSheetDialogFragment

//CREATED BY: KHALID ISAH
class TakeAttendanceFragment : BottomSheetDialogFragment() {
    lateinit var imgFingerprint: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_take_attendance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        handleEvents()
    }

    private fun handleEvents() {
        imgFingerprint.setOnClickListener {
            findNavController().navigate(R.id.action_takeAttendanceFragment_to_homeFragment)
        }
    }

    private fun bindViews(view: View) {
        imgFingerprint = view.findViewById(R.id.imgFingerprint)
    }

    companion object {
        val TAG = "TakeAttendanceFragment"
    }
}