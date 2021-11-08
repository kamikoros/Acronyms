package com.example.proyecto.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyecto.databinding.ActivityMainBinding
import com.example.proyecto.ui.adapter.AdapterList
import com.example.proyecto.ui.viewmodel.ViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: ViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.search.setOnClickListener {
            viewModel.search(binding.searchText.text.toString())
        }
        binding.list.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterList(mutableListOf())
        }
    }


}