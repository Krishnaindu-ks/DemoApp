package com.ks.demoapp.view



import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.ks.demoapp.R
import com.ks.demoapp.databinding.ActivityMainBinding


class MainActivity : BaseActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_main
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutResourceId())

        setupViews()
        setupTabLayout()

    }


    override fun setupViews() {
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(HomeFragment(), "Home")
        pagerAdapter.addFragment(IntegrationFragment(), "Integration")
        pagerAdapter.addFragment(SettingsFragment(), "Settings")

        binding.viewPager.adapter = pagerAdapter
    }

    override fun setupTabLayout() {
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }

    }
class ViewPagerAdapter(fragmentManager: FragmentManager):
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
        private val fragmentList = mutableListOf<Fragment>()
        private val fragmentTitleList = mutableListOf<String>()

    fun addFragment(fragment: Fragment,title:String){
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList[position]
    }


    }
