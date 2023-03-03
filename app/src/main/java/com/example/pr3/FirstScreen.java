package com.example.pr3;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
        Toast.makeText(getActivity(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "onAttach", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onAttach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.fragment_first_screen, container, false);
        Toast.makeText(getActivity(), "onCreateView", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreateView");
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
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity(), "onDestroyView", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "onDetach", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDetach");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");
    }

}