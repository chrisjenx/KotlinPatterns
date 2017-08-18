package uk.co.chrisjenx.kotlinpatterns.tricks4

import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
@Singleton class BarImplimentation
@Inject constructor() : BarInterface {

    override fun getSomething(): Single<Boolean> {
        return Single.fromCallable { true }
    }

}