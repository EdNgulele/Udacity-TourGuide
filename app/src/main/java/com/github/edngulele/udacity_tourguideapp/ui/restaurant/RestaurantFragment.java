package com.github.edngulele.udacity_tourguideapp.ui.restaurant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.edngulele.udacity_tourguideapp.R;
import com.github.edngulele.udacity_tourguideapp.adapter.LocationAdapter;
import com.github.edngulele.udacity_tourguideapp.model.LocationModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    LocationAdapter locationAdapter;
    ArrayList<LocationModel> locationData;
    RecyclerView recyclerView;

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_location, container, false);

        recyclerView = view.findViewById(R.id.rv_hotel);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        prepareData();

        locationAdapter = new LocationAdapter(locationData, requireContext());
        recyclerView.setAdapter(locationAdapter);


        // Inflate the layout for this fragment
        return view;
    }

    //Creates different models and adds them to the ArrayList
    public void prepareData() {

        int[] image = new int[]{
                R.drawable.cosy_italian,
                R.drawable.galaxy,
                R.drawable.spazio,
                R.drawable.mimmos,
        };

        locationData = new ArrayList<>();

        locationData.add(new LocationModel(getString(R.string.restaurantName_1),
                getString(R.string.restaurantDescription_1),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[0]));

        locationData.add(new LocationModel(getString(R.string.restaurantName_2),
                getString(R.string.restaurantDescription_2),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[1]));

        locationData.add(new LocationModel(getString(R.string.restaurantName_3),
                getString(R.string.restaurantDescription_3),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[2]));

        locationData.add(new LocationModel(getString(R.string.restaurantName_4),
                getString(R.string.restaurantDescription_4),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[3]));

    }
}
