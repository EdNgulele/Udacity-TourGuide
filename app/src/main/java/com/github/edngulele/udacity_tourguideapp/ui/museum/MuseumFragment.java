package com.github.edngulele.udacity_tourguideapp.ui.museum;

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
public class MuseumFragment extends Fragment {

    LocationAdapter locationAdapter;
    ArrayList<LocationModel> locationData;
    RecyclerView recyclerView;

    public MuseumFragment() {
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
                R.drawable.fortress,
                R.drawable.cfm,
                R.drawable.art,
                R.drawable.natural_history,
        };
        locationData = new ArrayList<>();

        locationData.add(new LocationModel(getString(R.string.museumName_1),
                getString(R.string.museumDescription_1),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[0]));

        locationData.add(new LocationModel(getString(R.string.museumName_2),
                getString(R.string.museumDescription_2),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[1]));

        locationData.add(new LocationModel(getString(R.string.museumName_2),
                getString(R.string.museumDescription_2),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[2]));

        locationData.add(new LocationModel(getString(R.string.museumName_2),
                getString(R.string.museumDescription_2),
                getString(R.string.genericLocation),
                getString(R.string.genericTime),
                getString(R.string.genericTime),
                image[3]));
    }
}
