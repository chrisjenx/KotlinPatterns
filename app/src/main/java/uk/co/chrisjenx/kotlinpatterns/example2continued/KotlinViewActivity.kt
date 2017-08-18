package uk.co.chrisjenx.kotlinpatterns.example2continued

import android.app.Activity
import android.view.View
import android.widget.FrameLayout

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class KotlinViewActivity : Activity() {

    // Just a sample
    private val view = View(this)
    // Just a sample
    private val viewGroup = FrameLayout(this)

    override fun onResume() {
        super.onResume()
        view.visible()
        view.gone()


        view.visible = true
        view.visible = false



        viewGroup.children().filter { view -> !view.visible }.forEach { it.visible() }

//        viewGroup.applyChildren { gone() }
    }


}