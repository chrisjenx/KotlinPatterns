package uk.co.chrisjenx.kotlinpatterns.example5

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity


inline fun FragmentManager.transact(block: FragmentTransaction.() -> Unit) {
    this.beginTransaction().apply(block).commit()
}

inline fun AppCompatActivity.fragmentTranactions(block: FragmentTransaction.() -> Unit) {
    supportFragmentManager.transact(block)
}