package uk.co.chrisjenx.kotlinpatterns.example1;

import android.app.Application;

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */

public class JavaApplication extends Application {

  public static JavaApplication sInstance;

  @Override public void onCreate() {
    sInstance = this;
    super.onCreate();
  }

}
