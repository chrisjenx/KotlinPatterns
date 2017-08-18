package uk.co.chrisjenx.kotlinpatterns.tricks4

import dagger.Module
import dagger.Provides
import uk.co.chrisjenx.kotlinpatterns.example5.FooActivity
import javax.inject.Singleton


// Note we are using Object not class we now have a "static" module.

@Module
object FooModule {

    // Note the jvm static
    @JvmStatic
    @Singleton
    @Provides
    fun foo(): FooActivity.Foo {
        return FooActivity.Foo()
    }


}

