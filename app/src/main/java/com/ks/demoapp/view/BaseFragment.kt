package com.ks.demoapp.view

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<T : ViewModel> : Fragment() {
    protected lateinit var viewModel:T

    protected inline  fun <reified VM : ViewModel> createViewModel(noinline factory: () ->VM):VM{
        val viewModelFactory = object : ViewModelProvider.Factory{
            override fun <T : ViewModel> create(modelClass: Class<T>):T {
                return factory() as T
            }
        }
        return ViewModelProvider(this,viewModelFactory).get(VM::class.java)
    }
}