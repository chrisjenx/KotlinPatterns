package uk.co.chrisjenx.kotlinpatterns.example3

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class FinalBetterKotlinActivity : Activity() {

    private val thingId: String by this //Intent.getStringExtra(thingId)
    private val thingNumber: Int by this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadSomething(thingId)
    }

    private fun loadSomething(thingId: String) {}

    companion object {

        operator fun invoke(context: Context, thingId: String, thingNumber: Int, block: Context.(Intent) -> Unit = {}) : Intent {
            return Intent<FinalBetterKotlinActivity>(context) {
                this["thingId"] = thingId
                this["thingNumber"] = thingNumber
                context.block(this)
            }
        }

    }

}