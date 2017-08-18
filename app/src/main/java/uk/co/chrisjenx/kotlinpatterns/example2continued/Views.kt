package uk.co.chrisjenx.kotlinpatterns.example2continued

import android.view.View
import android.view.ViewGroup




fun View.visible(): View {
    this.visibility = View.VISIBLE
    return this
}


fun View.gone(): View {
    this.visibility = View.GONE
    return this
}


fun View.invisible(): View {
    this.visibility = View.INVISIBLE
    return this
}











var View.visible: Boolean
    set(value) {
        if(value) visible() else gone()
    }
    get() = visibility == View.VISIBLE













fun ViewGroup.children() : Iterable<View> {
    return (0..this.childCount).map { getChildAt(it) }
}









fun ViewGroup.applyChildren(block: View.() -> Unit) {
    children().forEach(block)
}



