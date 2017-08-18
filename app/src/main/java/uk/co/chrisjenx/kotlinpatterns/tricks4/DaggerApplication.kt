package uk.co.chrisjenx.kotlinpatterns.tricks4

import android.app.Application

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
class DaggerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.Builder()
                .appModule(AppModule(this))
                .build()
        component.inject(this)
    }

    companion object {
       lateinit var component: AppComponent
    }

}