package uk.co.chrisjenx.kotlinpatterns.example4

import android.os.Bundle
import android.support.v4.app.Fragment
import kotlin.reflect.KProperty









// Getting from inside the fragment `by this` similar to the Activity


operator inline fun <reified T> Fragment.getValue(thisRef: Fragment, property: KProperty<*>): T {
    // Note you will get Class cast exception as this uses the default Bundle.get()
    return arguments[property.name] as T
}

// This adds a set delegate on the Fragment Classes. Now writing to delegated property inside the
// fragment will get written to the fragment arguments.

operator inline fun <reified T> Fragment.setValue(thisRef: Fragment, property: KProperty<*>, value: T) {
    arguments = (arguments ?: Bundle()).apply { this[property.name] = value }
}














// Set inside the bundle similar to the intent["key"]

operator inline fun <reified T> Bundle.set(key: String, value: T) {
    when (value) {
        is String -> putString(key, value)
        is Int -> putInt(key, value)
    //  other types...
        else -> throw RuntimeException("Unknown Bundle Type: ${T::class.java.simpleName}")
    }
}




















