package com.barissemerci.kentsimgeleri

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.barissemerci.kentsimgeleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private lateinit var landmarkList: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val colleseum = Landmark("Colleseum", "Italy", R.drawable.colleseum)
        val kizKulesi = Landmark("Maiden's Tower", "Turkey", R.drawable.kizkulesi)
        val londonBridge = Landmark("London Bridge", "UK", R.drawable.londonbridge)
        val piramitler = Landmark("Egyptian Pyramids", "Egypt", R.drawable.piramitler)
        val louvre = Landmark("Louvre Pyramid", "France", R.drawable.louvre)
        val sydneyOpera = Landmark("Sydney Opera House", "Australia", R.drawable.sydneyopera)
        val timesSquare = Landmark("Times Square", "USA", R.drawable.timessquare)
        val treviFountain = Landmark("Trevi Fountain", "Italy", R.drawable.trevicesmesi)




        landmarkList.add(colleseum)
        landmarkList.add(kizKulesi)
        landmarkList.add(londonBridge)
        landmarkList.add(piramitler)
        landmarkList.add(louvre)
        landmarkList.add(sydneyOpera)
        landmarkList.add(timesSquare)
        landmarkList.add(treviFountain)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

        binding.recyclerView.adapter = landmarkAdapter

    }
}