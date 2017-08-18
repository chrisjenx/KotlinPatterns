@file:Suppress("NOTHING_TO_INLINE")

package uk.co.chrisjenx.kotlinpatterns.tricks3

import io.reactivex.Observable
import java.util.concurrent.TimeUnit






inline fun <T> Observable<T>.onErrorWaitAndRetry(): Observable<T> {
    val chain = this
    return chain.onErrorResumeNext { _: Throwable ->
        Observable.timer(1, TimeUnit.SECONDS).flatMap { chain }
    }
}