package com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main.view

import com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main.JsonPlaceholderActivity
import com.adrian.android_kotlin_dagger2_contributesandroidinjector.ui.main.model.MainModel

class MainActivity : android.support.v7.app.AppCompatActivity(), MainRouter {

    @javax.inject.Inject
    lateinit var mainModel: MainModel

    lateinit var btnPostsPage: android.widget.Button

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        dagger.android.AndroidInjection.inject(this)
        setContentView(com.adrian.android_kotlin_dagger2_contributesandroidinjector.R.layout.activity_main)

        mainModel.callApiService()

        btnPostsPage = findViewById(com.adrian.android_kotlin_dagger2_contributesandroidinjector.R.id.btnPostsPage) as android.widget.Button
        btnPostsPage.setOnClickListener { openPostsPage() }
    }

    fun openPostsPage() {
        val intent = android.content.Intent(this, JsonPlaceholderActivity::class.java)
        startActivity(intent)
    }
}
