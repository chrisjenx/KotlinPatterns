package uk.co.chrisjenx.kotlinpatterns.tricks4

import io.reactivex.Single


interface BarInterface {

    fun getSomething(): Single<Boolean>

}