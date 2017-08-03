package com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.R

class MainActivity : AppCompatActivity(), MainRouter {

//    @Inject
//    lateinit var mainModel: MainModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
