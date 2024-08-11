// Generated by view binder compiler. Do not edit!
package com.danielme.android.bottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.danielme.android.bottomnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentReDriverBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final EditText editTextNumber;

  @NonNull
  public final EditText editTextText;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  private FragmentReDriverBinding(@NonNull FrameLayout rootView, @NonNull Button button,
      @NonNull EditText editTextNumber, @NonNull EditText editTextText, @NonNull TextView textView3,
      @NonNull TextView textView6, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.button = button;
    this.editTextNumber = editTextNumber;
    this.editTextText = editTextText;
    this.textView3 = textView3;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentReDriverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentReDriverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_re_driver, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentReDriverBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.editTextNumber;
      EditText editTextNumber = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber == null) {
        break missingId;
      }

      id = R.id.editTextText;
      EditText editTextText = ViewBindings.findChildViewById(rootView, id);
      if (editTextText == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new FragmentReDriverBinding((FrameLayout) rootView, button, editTextNumber,
          editTextText, textView3, textView6, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
