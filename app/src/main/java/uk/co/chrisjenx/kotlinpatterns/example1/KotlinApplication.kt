package uk.co.chrisjenx.kotlinpatterns.example1

import android.app.Application
import uk.co.chrisjenx.kotlinpatterns.example3.FinalBetterKotlinActivity
import kotlin.properties.Delegates

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */
class KotlinApplication : Application() {

    override fun onCreate() {
        instance = this
        super.onCreate()

        FinalBetterKotlinActivity.invoke(this,"String",0) { startActivity(it) }

    }

    companion object {
//        lateinit var instance: KotlinApplication
        var instance: KotlinApplication by Delegates.notNull()

    }

}

