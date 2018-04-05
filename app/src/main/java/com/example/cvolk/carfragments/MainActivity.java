package com.example.cvolk.carfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.example.cvolk.carfragments.fragments.AddCarFragment;
import com.example.cvolk.carfragments.fragments.ViewCarFragment;
import com.example.cvolk.carfragments.model.App;
import com.example.cvolk.carfragments.model.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindRecyclerView();
    }

    private void bindRecyclerView() {
        App.adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                App.cars
        );
    }

    public void onCreateClicked(View view) {
        Button btn = ((Button)view);
        if(btn.getText().toString().equals("Show Creator")) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.addCarFrame, new AddCarFragment(), "CREATE")
                    .commit();
            btn.setText("Close Creator");
        }
        else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(getSupportFragmentManager()
                            .findFragmentByTag("CREATE"))
                    .commit();
            btn.setText("Show Creator");
        }
    }

    public void onViewClicked(View view) {
        Button btn = ((Button)view);
        if (btn.getText().toString().equals("Show Viewer"))
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.viewCarsFrame, new ViewCarFragment(), "VIEW")
                    .commit();
            btn.setText("Close Viewer");
        }
        else
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(getSupportFragmentManager().findFragmentByTag("VIEW"))
                    .commit();
            btn.setText("Show Viewer");
        }
    }
}