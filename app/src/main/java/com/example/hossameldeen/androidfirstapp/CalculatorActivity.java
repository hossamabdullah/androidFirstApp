package com.example.hossameldeen.androidfirstapp;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    private FragmentManager manager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        manager = getSupportFragmentManager();

        DisplayFragment displayFragment = DisplayFragment.newInstance();
        InputFragment inputFragment = InputFragment.newInstance();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.cont_fragment_display, displayFragment);
        transaction.add(R.id.cont_fragment_input, inputFragment);
        transaction.commit();
    }
}
