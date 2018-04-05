package com.example.cvolk.carfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.example.cvolk.carfragments.MainActivity;
import com.example.cvolk.carfragments.R;
import com.example.cvolk.carfragments.model.App;
import com.example.cvolk.carfragments.model.Car;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddCarFragment extends Fragment {

    private EditText etYear;
    private EditText etMake;
    private EditText etModel;
    private EditText etColor;
    private Button btnAddCar;

    public AddCarFragment() {
        // Required empty public constructor
        setEnterTransition(new Slide(Gravity.RIGHT));
        setExitTransition(new Slide(Gravity.LEFT));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_car, container, false);
        etYear = view.findViewById(R.id.etCarYear);
        etMake = view.findViewById(R.id.etCarMake);
        etModel = view.findViewById(R.id.etCarModel);
        etColor = view.findViewById(R.id.etCarColor);
        btnAddCar = view.findViewById(R.id.btnAddCar);

        btnAddCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Car car = new Car(
                        etYear.getText().toString(),
                        etMake.getText().toString(),
                        etModel.getText().toString(),
                        etColor.getText().toString()
                );

                App.cars.add(car);
                App.adapter.notifyDataSetChanged();
            }
        });

        return view;
    }
}