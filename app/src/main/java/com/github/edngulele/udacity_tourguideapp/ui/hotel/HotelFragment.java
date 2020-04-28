package com.github.edngulele.udacity_tourguideapp.ui.hotel;

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
public class HotelFragment extends Fragment {

    LocationAdapter locationAdapter;
    ArrayList<LocationModel> locationData;
    RecyclerView recyclerView;

    public HotelFragment() {
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

    public void prepareData() {

        int[] image = new int[]{
                R.drawable.southern_sun,
                R.drawable.afrinhotel,
                R.drawable.polana,
                R.drawable.stay_easy,
                R.drawable.radisson
        };

        locationData = new ArrayList<>();

        locationData.add(new LocationModel(getString(R.string.hotelName_1),
                getString(R.string.hotelDescription_1),
                getString(R.string.hotelLocation_1),
                getString(R.string.timeAllDay),
                getString(R.string.hotelPhone_1),
                image[0]));

        locationData.add(new LocationModel(getString(R.string.hotelName_2),
                getString(R.string.hotelDescription_2),
                getString(R.string.hotelLocation_2),
                getString(R.string.timeAllDay),
                getString(R.string.hotelPhone_2),
                image[1]));

        locationData.add(new LocationModel(getString(R.string.hotelName_3),
                getString(R.string.hotelDescription_3),
                getString(R.string.hotelLocation_3),
                getString(R.string.timeAllDay),
                getString(R.string.hotelPhone_3),
                image[2]));

        locationData.add(new LocationModel(getString(R.string.hotelName_4),
                getString(R.string.hotelDescription_4),
                getString(R.string.genericLocation),
                getString(R.string.timeAllDay),
                getString(R.string.hotelPhone_4),
                image[3]));

        locationData.add(new LocationModel(getString(R.string.hotelName_5),
                getString(R.string.hotelDescription_5),
                getString(R.string.genericLocation),
                getString(R.string.timeAllDay),
                getString(R.string.hotelPhone_5),
                image[4]));
    }
}
