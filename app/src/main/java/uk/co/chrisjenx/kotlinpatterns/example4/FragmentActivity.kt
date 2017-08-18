package uk.co.chrisjenx.kotlinpatterns.example4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class FragmentActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Standard Java way
        JavaFragment.newInstance("JavaItem")

        // Operator ways
        KotlinFragment("JavaItem")
        KotlinTwoFragment("JavaItem")
        KotlinThreeFragment("JavaItem")
    }

}