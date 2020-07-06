package com.sunasterisk.iflickr.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<VB: ViewDataBinding>: Fragment() {

    @get: LayoutRes
    protected abstract val layoutRes: Int

    protected var viewDataBinding: VB? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = performDataBinding(container)
        return viewDataBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initActionBar()
        initData()
        initViewModel()
        observerData()
    }

    override fun onDetach() {
        super.onDetach()
        disposableObserver()
    }

    abstract fun initActionBar()

    abstract fun initData()

    abstract fun initViewModel()

    abstract fun observerData()

    abstract fun disposableObserver()

    private fun performDataBinding(container: ViewGroup?): VB? =
        DataBindingUtil.inflate(
            LayoutInflater.from(activity),
            layoutRes,
            container,
            false
        )
}
