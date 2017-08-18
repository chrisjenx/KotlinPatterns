package uk.co.chrisjenx.kotlinpatterns.example5

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class FooActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //1. Inline this traction into a builder
        supportFragmentManager.beginTransaction()
                .add(FooOneFragment(), "One")
                .add(FooTwoFragment(), "Two")
                .commit()
    }


    // 2. Convert from Abstract parent
    fun getActivityService() = Foo()

    class Foo

}