package uk.co.chrisjenx.kotlinpatterns.example3

import android.app.Activity
import android.content.Intent
import kotlin.reflect.KProperty









operator inline fun <reified T> Activity.getValue(thisRef: Activity, property: KProperty<*>): T {
    // thisRef.intent OR intent as we are an extension function
    return when {
        T::class == String::class -> intent.getStringExtra(property.name) as T
        T::class == Int::class -> intent.getIntExtra(property.name, 0) as T
        else -> throw RuntimeException("Unknown Bundle Type: ${T::class.java.simpleName}")
    }
}



















operator inline fun <reified T> Intent.set(key: String, value: T) {
    when (value) {
        is String -> putExtra(key, value)
        is Int -> putExtra(key, value)
    //  other types...
        else -> throw RuntimeException("Unknown Bundle Type: ${T::class.java.simpleName}")
    }
}












