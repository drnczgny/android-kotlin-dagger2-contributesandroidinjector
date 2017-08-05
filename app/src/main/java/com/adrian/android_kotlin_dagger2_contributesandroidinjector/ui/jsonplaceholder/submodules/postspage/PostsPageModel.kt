package com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.jsonplaceholder.submodules.postspage

import com.adrian.android_kotlin_dagger2_contributesandroidinjector.data.ApiService

/**
 * Created by cadri on 2017. 08. 05..
 */

class PostsPageModel constructor(val apiService: ApiService) {

    fun callApiService() = apiService.fakeApiCall()

}