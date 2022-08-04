package com.gigaxysafe.attendxx.util

import android.view.View
import android.view.WindowInsetsController
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

interface OnHandleScreenClicks {
    fun onHandleScreenClicks()
}

fun hideSystemBars(decorView: View) {
    val windowInsetController =
        ViewCompat.getWindowInsetsController(decorView) ?: return
    windowInsetController.systemBarsBehavior =
        WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    windowInsetController.hide(WindowInsetsCompat.Type.systemBars())
}