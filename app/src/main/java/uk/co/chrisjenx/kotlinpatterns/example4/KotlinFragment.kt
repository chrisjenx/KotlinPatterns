package uk.co.chrisjenx.kotlinpatterns.example4

import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class KotlinFragment : Fragment() {

    val itemId by lazy { arguments.getString("itemId") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    companion object {
        operator fun invoke(itemId: String): KotlinFragment {
            return KotlinFragment().apply {
                Bundle().apply {
                    putString("itemId", itemId)
                    arguments = this
                }
            }
        }
    }

}