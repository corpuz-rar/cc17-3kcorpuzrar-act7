package com.example.act7BaguioCity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.act7BaguioCity.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {
    private lateinit var binding: FragmentCategoryBinding
    private val viewModel: ViewModelForMain by viewModels()
    private val args: CategoryFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Setting up the category title from the navigation argument
        binding.categoryTitle.text = args.category
        binding.placesRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Observing places from the ViewModel and setting the adapter
        viewModel.loadLocation(args.category)
        viewModel.location.observe(viewLifecycleOwner) { location ->
            binding.placesRecyclerView.adapter = locationAdapter(location) { place ->
                val action = CategoryFragmentDirections
                    .actionCategoryFragmentToDetailsFragment(place)
                findNavController().navigate(action)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.placesRecyclerView.adapter = null
    }
}
