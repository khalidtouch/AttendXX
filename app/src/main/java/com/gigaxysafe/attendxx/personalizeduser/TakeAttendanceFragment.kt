package com.gigaxysafe.attendxx.personalizeduser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gigaxysafe.attendxx.R

import com.google.android.material.bottomsheet.BottomSheetDialogFragment

//CREATED BY: KHALID ISAH
class TakeAttendanceFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_take_attendance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews()
        handleEvents()
    }

    private fun handleEvents() {

    }

    private fun bindViews() {

    }

    companion object {
        val TAG = "TakeAttendanceFragment"
    }
}