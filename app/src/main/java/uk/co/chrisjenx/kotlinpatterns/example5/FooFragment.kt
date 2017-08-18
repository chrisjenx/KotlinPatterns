package uk.co.chrisjenx.kotlinpatterns.example5

import android.support.v4.app.Fragment

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
abstract class FooFragment : Fragment() {

    fun getActivityService(): FooActivity.Foo? {
        return (activity as? FooActivity)?.getActivityService()
    }
}