package uk.co.chrisjenx.kotlinpatterns.tricks3

import android.os.Bundle
import android.widget.TextView
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import uk.co.chrisjenx.kotlinpatterns.example2continued.visible
import java.util.concurrent.TimeUnit

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
class RxActivity : RxBaseActivity() {

    val view = TextView(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        observableOne()
                .let { chain ->
                    chain.onErrorResumeNext { _: Throwable ->
                        Observable.timer(1, TimeUnit.SECONDS).flatMap { chain }
                    }
                }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { view.text = it.toString() }
                .apply {
                    disposables.add(this)
                }










        observableTwo()
                .onErrorWaitAndRetry()
                .observeOnMainThread()
                .subscribe { view.visible = !view.visible }
                .attach()

    }


    // Could be a database listener etc.
    fun observableOne() = Observable.interval(1, TimeUnit.SECONDS)

    // Maybe a network call
    fun observableTwo() = Observable.interval(2, TimeUnit.SECONDS)


}