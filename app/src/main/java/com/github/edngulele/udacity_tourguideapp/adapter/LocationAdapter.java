package com.github.edngulele.udacity_tourguideapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.github.edngulele.udacity_tourguideapp.R;
import com.github.edngulele.udacity_tourguideapp.model.LocationModel;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {
    ArrayList<LocationModel> locationData;
    Context context;

    public LocationAdapter(ArrayList<LocationModel> locationData, Context context) {
        this.locationData = locationData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_location, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.locationName.setText(locationData.get(position).getNameLocation());
        holder.locationDescription.setText(locationData.get(position).getDescriptionLocation());
        holder.localAddress.setText(locationData.get(position).getLocationAddress());
        holder.localPhone.setText(locationData.get(position).getPhoneLocation());
        holder.locationOpen.setText(locationData.get(position).getOpeningLocation());


        //loads the images
        Glide.with(context)
                .load(locationData.get(position).getImageLocation())
                .into(holder.locationImage);


    }

    @Override
    public int getItemCount() {
        return locationData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView locationName, locationDescription, localAddress, locationOpen, localPhone;
        ImageView locationImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            locationName = itemView.findViewById(R.id.tv_location_name);
            locationDescription = itemView.findViewById(R.id.tv_location_description);
            localAddress = itemView.findViewById(R.id.tv_location_address);
            locationOpen = itemView.findViewById(R.id.tv_location_open);
            localPhone = itemView.findViewById(R.id.tv_location_phone);
            locationImage = itemView.findViewById(R.id.iv_location);
        }
    }
}
