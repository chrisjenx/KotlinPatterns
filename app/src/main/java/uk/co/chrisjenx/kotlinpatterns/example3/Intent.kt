package uk.co.chrisjenx.kotlinpatterns.example3

import android.content.Context
import android.content.Intent


inline fun <reified T> Intent(context: Context, apply: Intent.() -> Unit): Intent {
    return Intent(context, T::class.java).apply(apply)
}

