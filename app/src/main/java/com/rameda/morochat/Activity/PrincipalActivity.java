package com.rameda.morochat.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.rameda.morochat.Fragments.PrincipalFragment;
import com.rameda.morochat.R;

public class PrincipalActivity extends AppCompatActivity {

    public static final String GOOGLE_ACCOUNT = "google_account";
    PrincipalFragment principalFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        principalFragment = new PrincipalFragment();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.containerparaprincipal,principalFragment);
        fragmentTransaction.commit();

    }
}
