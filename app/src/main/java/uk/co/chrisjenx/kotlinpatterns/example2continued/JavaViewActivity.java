package uk.co.chrisjenx.kotlinpatterns.example2continued;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class JavaViewActivity extends Activity {

  // Just a sample
  private View view = new View(this);
  // Just a sample
  private ViewGroup viewGroup = new FrameLayout(this);

  @Override public void onResume() {
    super.onResume();

    view.setVisibility(View.VISIBLE);
    view.setVisibility(View.GONE);

    for (int i = 0; i < viewGroup.getChildCount(); i++) {
      final View childAt = viewGroup.getChildAt(i);
      if (childAt.getVisibility() == View.GONE) childAt.setVisibility(View.VISIBLE);
    }
  }

}
