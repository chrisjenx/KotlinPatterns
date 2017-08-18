package uk.co.chrisjenx.kotlinpatterns.example4

import android.support.v4.app.Fragment

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class KotlinThreeFragment : Fragment() {

    var itemId: String by this
    var itemName: String by this

    companion object {
        operator fun invoke(itemId: String, itemName:String): KotlinThreeFragment {
            return KotlinThreeFragment().apply {
                this.itemId = itemId
                this.itemName = itemName
            }
        }
    }

}