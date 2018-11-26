package ru.codeking.criminalintent.controllers;

import android.support.v4.app.Fragment;

import ru.codeking.criminalintent.fragments.CrimeListFragment;
import ru.codeking.criminalintent.fragments.SingleFragmentActivity;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
