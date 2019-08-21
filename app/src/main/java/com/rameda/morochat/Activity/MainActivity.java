package com.rameda.morochat.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.rameda.morochat.Fragments.loginFragment;
import com.rameda.morochat.R;

public class MainActivity extends AppCompatActivity {
    private loginFragment LoginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

       LoginFragment = new loginFragment();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.ContainerChat,LoginFragment);
        fragmentTransaction.commit();
    }
}
