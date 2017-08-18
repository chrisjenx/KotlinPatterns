package uk.co.chrisjenx.kotlinpatterns.tricks4

import android.app.Application
import dagger.Component
import uk.co.chrisjenx.kotlinpatterns.example5.FooActivity
import javax.inject.Singleton

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
@Singleton
@Component
interface AppComponent {
    fun inject(daggerActivity: DaggerApplication)
    fun inject(daggerActivity: DaggerActivity)
    fun application(): Application
    fun foo(): FooActivity.Foo
}