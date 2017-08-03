package com.adrian.android_kotlin_dagger2_contributesandroidinjector

import com.adrian.android_kotlin_dagger2_contributesandroidinjector.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


/**
 * Created by cadri on 2017. 08. 03..0
 */

class MyApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<MyApplication> = DaggerAppComponent
            .builder()
            .create(this@MyApplication)

}