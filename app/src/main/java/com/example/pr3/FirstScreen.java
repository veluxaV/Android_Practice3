package com.example.pr3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstScreen extends Fragment {

    Button addCarButton;
    final String TAG = "FirstScreen";

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
            }
        });
        return v;
    }
}