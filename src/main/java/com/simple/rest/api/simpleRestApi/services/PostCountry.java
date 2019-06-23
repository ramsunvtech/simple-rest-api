package com.simple.rest.api.simpleRestApi.services;

public class PostCountry {


    public String country;

    public PostCountry() {}

    public PostCountry(String country) {
        this.country = country;
    }

    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry() {
        return country;
    }

}
