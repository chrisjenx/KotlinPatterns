package uk.co.chrisjenx.kotlinpatterns.example5

import android.app.Activity

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
interface FooFragmentInterface {

    // This is satisfied by the implementation, but as Fragment already has `getActivity()` we
    // don't need to implement this ourselves Kotlin works it out.
    fun getActivity(): Activity


    // "Default" Method similar to Java8... but we can have more than 1.
    fun getActivityService(): FooActivity.Foo? {
        return (getActivity() as? FooActivity)?.getActivityService()
    }
}