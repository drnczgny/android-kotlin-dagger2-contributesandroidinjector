package com.adrian.android_kotlin_dagger2_contributesandroidinjector.data

import android.util.Log
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.data.ApiService.name.TAG

/**
 * Created by cadri on 2017. 08. 03..
 */

class ApiService constructor() {

    object name {
        @JvmStatic val TAG = ApiService::class.java.simpleName
    }

    fun fakeApiCall() {
        Log.i(TAG, "fake API call...");
    }

}