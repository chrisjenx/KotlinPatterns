package uk.co.chrisjenx.kotlinpatterns.tricks3

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */



inline fun <T> Observable<T>.observeOnMainThread(): Observable<T> {
    return this.observeOn(AndroidSchedulers.mainThread())
}