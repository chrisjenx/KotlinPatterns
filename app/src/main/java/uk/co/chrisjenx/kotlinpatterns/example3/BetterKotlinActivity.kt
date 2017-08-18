package uk.co.chrisjenx.kotlinpatterns.example3

import android.app.Activity
import android.content.Context
import android.os.Bundle

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class BetterKotlinActivity : Activity() {

    private var thingId: String by this
    private var thingNumber: Int by this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadSomething(thingId)
    }

    private fun loadSomething(thingId: String) {}

    companion object {

        const internal val EXTRA_THING_ID = "thing_id"
        const internal val EXTRA_THING_NUMBER = "thing_number"


        fun start(context: Context, thingId: String, thingNumber: Int) {
            Intent<BetterKotlinActivity>(context) {
                this[EXTRA_THING_ID] = thingId
                this[EXTRA_THING_NUMBER] = thingNumber
                context.startActivity(this)
            }
        }


    }

}
