package uk.co.chrisjenx.kotlinpatterns.example4

import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class KotlinTwoFragment : Fragment() {

    val itemId: String by this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    companion object {
        operator fun invoke(itemId: String): KotlinTwoFragment {
            return KotlinTwoFragment().apply {
                Bundle().apply {
                    this["itemId"] = itemId
                    arguments = this
                }
            }
        }
    }

}


