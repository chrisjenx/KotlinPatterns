package uk.co.chrisjenx.kotlinpatterns.example2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */

public class JavaActivity extends Activity {

  final static String EXTRA_THING_ID = "thing_id";
  final static String EXTRA_THING_NUMBER = "thing_number";

  public static void start(Context context, String thingId, int thingNumber) {
    Intent starter = new Intent(context, JavaActivity.class);
    starter.putExtra(EXTRA_THING_ID, thingId);
    starter.putExtra(EXTRA_THING_NUMBER, thingNumber);
    context.startActivity(starter);
  }

  private String thingId;
  private int thingNumber;


  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    thingId = getIntent().getStringExtra(EXTRA_THING_ID);
    thingNumber = getIntent().getIntExtra(EXTRA_THING_NUMBER, 0);
  }
}
