package com.example.act7BaguioCity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.act7BaguioCity.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.foodTripButton.setOnClickListener {
            navigateToCategory("Food Trip")
        }
        binding.schoolsButton.setOnClickListener {
            navigateToCategory("Schools")
        }
        binding.parksButton.setOnClickListener {
            navigateToCategory("Parks")
        }
        binding.gymsButton.setOnClickListener {
            navigateToCategory("Gyms")
        }
        binding.cafeButton.setOnClickListener {
            navigateToCategory("Cafe")
        }
    }

    private fun navigateToCategory(category: String) {
        val action = MainFragmentDirections.actionMainFragmentToCategoryFragment(category)
        findNavController().navigate(action)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
