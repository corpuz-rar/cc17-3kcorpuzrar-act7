package com.example.act7BaguioCity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.act7BaguioCity.databinding.FragmentOverviewBinding

class overViewFragment : Fragment() {
    private lateinit var binding: FragmentOverviewBinding
    private val args: overViewFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOverviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Accessing the Place object from the arguments
        val location = args.location
        binding.placeImage.setImageResource(location.imageResource)
        binding.placeDetails.text = location.details
    }
}
