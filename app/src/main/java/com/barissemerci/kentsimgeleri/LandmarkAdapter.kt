package com.barissemerci.kentsimgeleri

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.barissemerci.kentsimgeleri.databinding.RecyclerViewBinding

class LandmarkAdapter(private val landmarkList: ArrayList<Landmark>) :
    RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerViewBinding) : RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {

        val binding =
            RecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerRowName.text = landmarkList[position].name

        holder.itemView.setOnClickListener() {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("landmark", landmarkList[position])
            holder.itemView.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}