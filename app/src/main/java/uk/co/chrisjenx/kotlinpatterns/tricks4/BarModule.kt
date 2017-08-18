package uk.co.chrisjenx.kotlinpatterns.tricks4

import dagger.Binds
import dagger.Module

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
@Module
interface BarModule {

    // No kotlin magic, dagger mostly, but neater.
    //
    // Use BarImplementation to satisfy BarInterface
    @Binds fun bindBar(bar: BarImplimentation) : BarInterface

}