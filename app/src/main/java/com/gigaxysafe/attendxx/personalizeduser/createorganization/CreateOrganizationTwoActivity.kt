package com.gigaxysafe.attendxx.personalizeduser.createorganization

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gigaxysafe.attendxx.R
import com.gigaxysafe.attendxx.databinding.ActivityCreateOrganization2Binding
import com.gigaxysafe.attendxx.databinding.FragmentHomeBinding
import com.gigaxysafe.attendxx.personalizeduser.PersonalizedUserBaseActivity
import com.gigaxysafe.attendxx.util.hideSystemBars
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng

class CreateOrganizationTwoActivity : AppCompatActivity(),
    OnMapReadyCallback {
    private var _binding: ActivityCreateOrganization2Binding? = null
    private val binding get() = _binding
    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCreateOrganization2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        val mapFragment =
            supportFragmentManager.findFragmentById(R.id.SelectGeofenceMap) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onResume() {
        super.onResume()
        hideSystemBars(binding?.root as View )
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

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        map.uiSettings.isMapToolbarEnabled = false
        centerCamera()
    }

    private fun centerCamera() {
        val latLng = LatLng(23.543, 78.342)
        val zoom = 1.5f
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
    }
}