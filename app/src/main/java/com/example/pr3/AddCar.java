package com.example.pr3;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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
        Toast.makeText(getActivity(), "onCreateAddCar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "onAttachAddCar", Toast.LENGTH_SHORT).show();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_add_car, container, false);
        Toast.makeText(getActivity(), "onCreateViewAddCar", Toast.LENGTH_SHORT).show();
        backButton = (Button) v.findViewById(R.id.GoBackButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Button click in AddCar");
                if (savedInstanceState == null) {
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, FirstScreen.newInstance())
                            .commit();
                }
            }
        });
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "onResumeAddCar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "onPauseAddCar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity(), "onDestroyViewAddCar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "onDetachAddCar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "onDestroyAddCar", Toast.LENGTH_SHORT).show();

    }
}