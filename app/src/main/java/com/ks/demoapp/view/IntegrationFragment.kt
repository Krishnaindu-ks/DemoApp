package com.ks.demoapp.view

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.ks.demoapp.R
import com.ks.demoapp.adapters.IntegrationAdapter

import com.ks.demoapp.databinding.FragmentIntegrationBinding
import com.ks.demoapp.model.UIComponent
import com.ks.demoapp.viewmodel.IntegrationViewModel


class IntegrationFragment : BaseFragment<IntegrationViewModel>() {
    private lateinit var binding: FragmentIntegrationBinding
    private lateinit var adapter: IntegrationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_integration, container, false)
        setupRecyclerView()
        return binding.root


    }
    private fun setupRecyclerView(){
        adapter = IntegrationAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=adapter

        val components = listOf(
            UIComponent("EditText"),
            UIComponent("Button"),
            UIComponent("Alerts"),
            UIComponent("Toast"),
            UIComponent("Loading View"),
            UIComponent("Label")
        )
        adapter.setData(components)
    }
}