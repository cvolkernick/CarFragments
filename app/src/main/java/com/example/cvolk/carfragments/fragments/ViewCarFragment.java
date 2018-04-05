package com.example.cvolk.carfragments.fragments;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.cvolk.carfragments.MainActivity;
import com.example.cvolk.carfragments.R;
import com.example.cvolk.carfragments.model.App;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class ViewCarFragment extends Fragment {

    private ListView lvCarsView;

    public ViewCarFragment() {
        // Required empty public constructor
        setEnterTransition(new Slide(Gravity.RIGHT));
        setExitTransition(new Slide(Gravity.LEFT));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_car, container, false);
        lvCarsView = view.findViewById(R.id.lvCarsView);
        lvCarsView.setAdapter(App.adapter);

        return view;
    }

}
