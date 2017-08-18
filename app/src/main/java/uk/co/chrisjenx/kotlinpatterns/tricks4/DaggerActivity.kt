package uk.co.chrisjenx.kotlinpatterns.tricks4

import android.app.Activity
import android.os.Bundle
import uk.co.chrisjenx.kotlinpatterns.example5.FooActivity
import javax.inject.Inject

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
class DaggerActivity : Activity() {

    @Inject lateinit var foo: FooActivity.Foo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent().inject(this)
    }

}