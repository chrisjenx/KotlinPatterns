package uk.co.chrisjenx.kotlinpatterns.tricks4

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton




@Module(includes = arrayOf(FooModule::class, BarModule::class))
class AppModule(val application: DaggerApplication) {

    @Singleton
    @Provides
    fun provideApplication(): Application {
        return application
    }

}