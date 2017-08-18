package uk.co.chrisjenx.kotlinpatterns.example5

import android.os.Bundle

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class FooOneFragment : FooFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getActivityService()
    }

}