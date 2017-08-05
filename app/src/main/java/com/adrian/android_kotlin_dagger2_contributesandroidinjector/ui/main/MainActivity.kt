package com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.R
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainRouter {

    @Inject
    lateinit var mainModel: MainModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        mainModel.callApiService()
    }
}
