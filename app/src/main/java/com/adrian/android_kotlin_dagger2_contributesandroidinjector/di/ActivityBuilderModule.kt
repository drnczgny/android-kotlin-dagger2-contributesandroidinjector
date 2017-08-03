package com.adrian.android_kotlin_dagger2_contributesandroidinjector.di

import com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main.MainActivity
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main.di.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cadri on 2017. 08. 03..
 */

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

}