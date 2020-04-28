package com.github.edngulele.udacity_tourguideapp.model;


/*
* This is a global model class for all the objects, since I will be
* displaying the same type of content for each Location (place)
* */

public class LocationModel {
    String nameLocation, descriptionLocation, locationAddress, openingLocation;
    String phoneLocation;
    int imageLocation;


    public LocationModel(String nameLocation, String descriptionLocation, String locationAddress, String openingLocation, String phoneLocation, int imageLocation) {
        this.nameLocation = nameLocation;
        this.descriptionLocation = descriptionLocation;
        this.locationAddress = locationAddress;
        this.openingLocation = openingLocation;
        this.phoneLocation = phoneLocation;
        this.imageLocation = imageLocation;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public int getImageLocation() {
        return imageLocation;
    }

    public String getDescriptionLocation() {
        return descriptionLocation;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getOpeningLocation() {
        return openingLocation;
    }

    public String getPhoneLocation() {
        return phoneLocation;
    }
}
