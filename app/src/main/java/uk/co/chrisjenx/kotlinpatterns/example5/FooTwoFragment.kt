package uk.co.chrisjenx.kotlinpatterns.example5

import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class FooTwoFragment : Fragment(), FooFragmentInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val foo: FooActivity.Foo? = getActivityService()

    }

}