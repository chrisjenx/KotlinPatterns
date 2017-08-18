package uk.co.chrisjenx.kotlinpatterns.example2

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class KotlinActivity : Activity() {

    private val thingId: String by lazy { intent.getStringExtra(EXTRA_THING_ID) }
    private val thingNumber: Int by lazy { intent.getIntExtra(EXTRA_THING_NUMBER, 0) }



    companion object {

        const internal val EXTRA_THING_ID = "thing_id"
        const internal val EXTRA_THING_NUMBER = "thing_number"

        fun start(context: Context, thingId: String, thingNumber: Int) {
            val starter = Intent(context, JavaActivity::class.java)
            starter.putExtra(EXTRA_THING_ID, thingId)
            starter.putExtra(EXTRA_THING_NUMBER, thingNumber)
            context.startActivity(starter)
        }

    }

}
