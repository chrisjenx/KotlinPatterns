package uk.co.chrisjenx.kotlinpatterns.tricks1

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity






inline fun <reified VM : ViewModel> FragmentActivity.getViewModel(key: String? = null): VM {
    return ViewModelProviders.of(this).let {
        it.get(VM::class.java)
    }
}






inline fun <reified VM : ViewModel> Fragment.getViewModel(key: String? = null): VM {
    return ViewModelProviders.of(this).let {
        if (key != null) it.get(key, VM::class.java)
        else it.get(VM::class.java)
    }
}




