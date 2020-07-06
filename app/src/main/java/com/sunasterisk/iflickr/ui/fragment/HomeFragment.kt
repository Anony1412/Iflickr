package com.sunasterisk.iflickr.ui.fragment

import android.os.Build
import androidx.annotation.RequiresApi
import com.sunasterisk.iflickr.R
import com.sunasterisk.iflickr.base.BaseFragment
import com.sunasterisk.iflickr.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.custom_action_bar.*
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val layoutRes: Int
        get() = R.layout.fragment_home

    private val homeViewModel: HomeViewModel by viewModel()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun initActionBar() {
        val typeFace = resources.getFont(R.font.shink)
        textActionBarTitle.apply {
            text = getString(R.string.app_name)
            typeface = typeFace
        }
    }

    override fun initData() {

    }

    override fun initViewModel() {

    }

    override fun observerData() {

    }

    override fun disposableObserver() {

    }

    companion object {

        fun newInstance(): HomeFragment = HomeFragment()
    }
}
