package com.ks.demoapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ks.demoapp.R
import com.ks.demoapp.databinding.FragmentHomeBinding
import com.ks.demoapp.viewmodel.HomeViewModel


class HomeFragment : BaseFragment<HomeViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        viewModel = createViewModel { HomeViewModel() }
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root

    }
}