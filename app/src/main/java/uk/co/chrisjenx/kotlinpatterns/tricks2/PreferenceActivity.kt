package uk.co.chrisjenx.kotlinpatterns.tricks2

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.preference.Preference
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
class PreferenceActivity : Activity() {


    // Helped by magic of reified generics and operators
    private var isSomethingEnabled: Boolean by PreferenceDelegate(Boolean::class.java)





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isSomethingEnabled = false
    }











    inline fun <reified T> preference(): PreferenceDelegate<T> = PreferenceDelegate(T::class.java)


    class PreferenceDelegate<T>(private val clazz: Class<T>) : ReadWriteProperty<Context, T> {




        override fun getValue(thisRef: Context, property: KProperty<*>): T {
            val prefs = thisRef.getSharedPreferences("default", 0)
            return when {
                clazz == String::class.java -> prefs.getString(property.name, "") as T
            // etc
                else -> throw RuntimeException()
            }
        }





        override fun setValue(thisRef: Context, property: KProperty<*>, value: T) {
            thisRef.getSharedPreferences("default", 0).edit().apply {
                when (value) {
                    is String -> putString(property.name, value)
                }
            }.apply()
        }




    }


}