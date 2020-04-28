package com.github.edngulele.udacity_tourguideapp.ui.shopping;

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
public class ShoppingFragment extends Fragment {

    LocationAdapter locationAdapter;
    ArrayList<LocationModel> locationData;
    RecyclerView recyclerView;

    public ShoppingFragment() {
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
                R.drawable.feima,
                R.drawable.central_market,
                R.drawable.shopping_center,
                R.drawable.craft_center,
        };

        locationData = new ArrayList<>();

        locationData.add(new LocationModel(getString(R.string.shoppingName_1),
                getString(R.string.shoppingDescription_1),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[0]));

        locationData.add(new LocationModel(getString(R.string.shoppingName_2),
                getString(R.string.shoppingDescription_2),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[1]));

        locationData.add(new LocationModel(getString(R.string.shoppingName_3),
                getString(R.string.shoppingDescription_3),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[2]));

        locationData.add(new LocationModel(getString(R.string.shoppingName_4),
                getString(R.string.shoppingDescription_4),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[3]));
    }
}
