package ru.codeking.criminalintent.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import ru.codeking.criminalintent.R;

public class DatePickerFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.data_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
