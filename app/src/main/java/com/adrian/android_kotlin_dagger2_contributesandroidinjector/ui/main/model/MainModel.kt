package com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main.model

import com.adrian.android_kotlin_dagger2_contributesandroidinjector.data.ApiService

/**
 * Created by cadri on 2017. 08. 03..
 */

class MainModel constructor(val apiService: ApiService) {

    fun callApiService() {
        apiService.fakeApiCall()
    }

}