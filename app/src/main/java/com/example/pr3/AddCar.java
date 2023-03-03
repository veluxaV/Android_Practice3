package com.example.pr3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AddCar extends Fragment {

    Button backButton;
    final String TAG = "AddCarLayout";

    public static AddCar newInstance() {
        AddCar fragment = new AddCar();
        //Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        //fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_add_car, container, false);

        backButton = (Button) v.findViewById(R.id.GoBackButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Button click in FirstScreen");
                if (savedInstanceState == null) {
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, FirstScreen.newInstance())
                            .commit();
                }
            }
        });
        return v;
    }
}