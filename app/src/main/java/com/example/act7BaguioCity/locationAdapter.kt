package com.example.act7BaguioCity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.act7BaguioCity.databinding.LocationLayoutBinding

class locationAdapter(
    private val Locations: List<Location>,
    private val onClick: (Location) -> Unit
) : RecyclerView.Adapter<locationAdapter.LocationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        val binding = LocationLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return LocationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        holder.bind(Locations[position], onClick)
    }

    override fun getItemCount(): Int = Locations.size

    inner class LocationViewHolder(private val binding: LocationLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(location: Location, onClick: (Location) -> Unit) {
            binding.locationName.text = location.name
            binding.root.setOnClickListener { onClick(location) }
        }
    }
}
