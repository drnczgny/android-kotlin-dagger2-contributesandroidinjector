package com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.jsonplaceholder.submodules.postspage.di

import com.adrian.android_kotlin_dagger2_contributesandroidinjector.data.ApiService
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.scope.FragmentScope
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.jsonplaceholder.submodules.postspage.PostsPageFragment
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.jsonplaceholder.submodules.postspage.PostsPageModel
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.jsonplaceholder.submodules.postspage.PostsPageRouter
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
class PostsPageModule {

    @FragmentScope
    @Provides
    fun providesPostsPageRouter(postsPageFragment: PostsPageFragment): PostsPageRouter = postsPageFragment

    @FragmentScope
    @Provides
    fun providesPostsPageModel(apiService: ApiService) = PostsPageModel(apiService)

}