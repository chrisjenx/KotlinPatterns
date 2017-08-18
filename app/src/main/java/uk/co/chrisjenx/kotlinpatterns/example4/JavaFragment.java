package uk.co.chrisjenx.kotlinpatterns.example4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created on 16/08/2017.
 * For AndroidKotlinPatterns.
 */

public class JavaFragment extends Fragment {

  private String itemId;

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    itemId = getArguments().getString("itemId");
  }

  public static JavaFragment newInstance(String itemId) {
    Bundle args = new Bundle();
    args.putString("itemId", itemId);
    JavaFragment fragment = new JavaFragment();
    fragment.setArguments(args);
    return fragment;
  }
}
