package com.adrian.android_kotlin_dagger2_contributesandroidinjector.scope

import javax.inject.Qualifier
import javax.inject.Scope

/**
 * Created by cadri on 2017. 08. 03..
 */

@Qualifier
@Retention(value = AnnotationRetention.RUNTIME)
@Scope
annotation class FragmentScope