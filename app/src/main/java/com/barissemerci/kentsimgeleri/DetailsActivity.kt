package com.barissemerci.kentsimgeleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.barissemerci.kentsimgeleri.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        binding.textViewHeader.text = selectedLandmark.name
        binding.textViewDetail.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}