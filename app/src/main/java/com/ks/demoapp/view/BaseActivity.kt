package com.ks.demoapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected abstract fun getLayoutResourceId() : Int
    protected abstract fun setupViews()
    protected abstract fun setupTabLayout()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResourceId())

    }
}