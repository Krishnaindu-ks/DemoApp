package com.ks.demoapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ks.demoapp.R
import com.ks.demoapp.databinding.FragmentSettingsBinding
import com.ks.demoapp.viewmodel.SettingsViewModel

class SettingsFragment : BaseFragment<SettingsViewModel>() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSettingsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)
        viewModel = createViewModel { SettingsViewModel() }
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }


}