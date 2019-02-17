package com.example.hackswipe;

import java.util.ArrayList;

public class Person {
    private String name, location, contactInfo;
   // private ArrayList<String> Skills = new ArrayList<String>();



    public Person() {
        this.name = "";
        this.location = "";
        this.contactInfo = "";

    }

    public Person(String name, String location, String contactInfo) {
        this.name = name;
        this.location = location;
        this.contactInfo = contactInfo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

