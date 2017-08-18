package uk.co.chrisjenx.kotlinpatterns.tricks1

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.FragmentActivity

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class ReifiedActivity : FragmentActivity() {

    private val viewModel: MyViewModel get() = getViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel =  ViewModelProviders.of(this).get(MyViewModel::class.java)

        viewModel.myFun()
    }

}