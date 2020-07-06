package com.sunasterisk.iflickr.di

import com.sunasterisk.iflickr.ui.fragment.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { HomeViewModel(get(named(KoinNames.PHOTO_REPOSITORY))) }
}
