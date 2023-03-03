package com.example.pr3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstScreen extends Fragment {

    Button addCarButton;
    final String TAG = "FirstScreenLayout";

    public static FirstScreen newInstance() {
        FirstScreen fragment = new FirstScreen();
        Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        //fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.fragment_first_screen, container, false);


        addCarButton = (Button) v.findViewById(R.id.add_car_button);

        addCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Button click in FirstScreen");
                if (savedInstanceState == null) {
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, AddCar.newInstance())
                            .commit();
                }
                //AddCar addCar = new AddCar();
               // FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                //fragmentTransaction.replace(R.id., addCar);
                //fragmentTransaction.addToBackStack(null);
                //fragmentTransaction.commit();
            }
        });
        return v;
    }
}