package ru.codeking.criminalintent.controllers;

import android.support.v4.app.Fragment;

import ru.codeking.criminalintent.fragments.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
