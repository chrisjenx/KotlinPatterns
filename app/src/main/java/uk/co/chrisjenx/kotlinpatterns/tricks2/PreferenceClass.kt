package uk.co.chrisjenx.kotlinpatterns.tricks2

import android.content.SharedPreferences

/**
 * Created on 17/08/2017.
 * For AndroidKotlinPatterns.
 */
class PreferenceClass(prefs: SharedPreferences) {


    // Helped by magic of reified generics and operators
    var somethingEnabled: Boolean by prefs
    var sendPushNotifications: Boolean by prefs
    var username: String by prefs


}


