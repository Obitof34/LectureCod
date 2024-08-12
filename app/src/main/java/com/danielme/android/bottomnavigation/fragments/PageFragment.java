package com.danielme.android.bottomnavigation.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.danielme.android.bottomnavigation.CheckBuggy;
import com.danielme.android.bottomnavigation.R;

public class PageFragment extends Fragment {

  private static final String ARG_ICON = "ARG_ICON";

  public static PageFragment newInstance(@DrawableRes int iconId) {
    PageFragment frg = new PageFragment();
    Bundle args = new Bundle();
    args.putInt(ARG_ICON, iconId);
    frg.setArguments(args);
    return frg;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
  Bundle savedInstanceState) {
    View layout = inflater.inflate(R.layout.fragment_page, container, false);

    // Encuentra el botón y el EditText
    Button btnScan = layout.findViewById(R.id.btnScan);
    final EditText etextScan = layout.findViewById(R.id.etextScan);

    // Configura el listener para el botón
    btnScan.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        btnScan.setVisibility(View.INVISIBLE);
        etextScan.setVisibility(View.VISIBLE);

        // Configura el listener para el EditText
        etextScan.setOnEditorActionListener((v1, actionId, event) -> {
          String code = etextScan.getText().toString().trim();
          if (isValidCode(code)) {
            // Código válido, abre el nuevo fragmento
            openCheckBuggyFragment();
          } else {
            // Código inválido, muestra un mensaje de error
            Toast.makeText(getActivity(), "Código inválido. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
          }
          return true;
        });
      }
    });

    return layout;
  }

  private boolean isValidCode(String code) {
    // Aquí debes implementar la lógica de validación de código

    return !TextUtils.isEmpty(code) && code.equals("1234"); // Cambia "EXPECTED_CODE" por el valor esperado
  }

  private void openCheckBuggyFragment() {
    FragmentManager fragmentManager = getFragmentManager();
    if (fragmentManager != null) {
      FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
      Fragment checkBuggyFragment = new CheckBuggy(); // Asegúrate de que CheckBuggyFragment esté implementado
      fragmentTransaction.replace(R.id.container, checkBuggyFragment);
      fragmentTransaction.addToBackStack(null);
      fragmentTransaction.commit();
    }
  }
}
