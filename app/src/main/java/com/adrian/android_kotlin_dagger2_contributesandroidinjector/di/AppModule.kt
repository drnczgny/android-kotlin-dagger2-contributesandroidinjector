package com.adrian.android_kotlin_dagger2_contributesandroidinjector.di

import com.adrian.android_kotlin_dagger2_contributesandroidinjector.MyApplication
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.data.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cadri on 2017. 08. 03..
 */

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(myApplication: MyApplication) = myApplication

    @Singleton
    @Provides
    fun provideApiService() = ApiService()

}