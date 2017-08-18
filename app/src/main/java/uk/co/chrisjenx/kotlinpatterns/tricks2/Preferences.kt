package uk.co.chrisjenx.kotlinpatterns.tricks2

import android.content.SharedPreferences
import kotlin.reflect.KProperty

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
inline operator fun <reified T> SharedPreferences.getValue(thisRef: Any, property: KProperty<*>): T {
    return when {
        T::class == String::class -> this.getString(property.name, "") as T
        T::class == Boolean::class -> this.getBoolean(property.name, false) as T
    //  etc
        else -> throw RuntimeException()
    }
}


inline operator fun <reified T> SharedPreferences.setValue(thisRef: Any, property: KProperty<*>, value: T) {
    this.edit().apply {
        when (value) {
            is String -> putString(property.name, value)
            is Boolean -> putBoolean(property.name, value)
        //  etc
            else -> throw RuntimeException()
        }
    }.apply()
}