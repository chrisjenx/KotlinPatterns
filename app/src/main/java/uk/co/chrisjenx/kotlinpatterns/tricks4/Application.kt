package uk.co.chrisjenx.kotlinpatterns.tricks4

import android.app.Application

// Global App Component
fun appComponent(): AppComponent = DaggerApplication.component


// Global Application Object
fun application(): Application = appComponent().application()