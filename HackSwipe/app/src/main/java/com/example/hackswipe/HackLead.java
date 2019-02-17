package com.example.hackswipe;

import com.example.hackswipe.Person;

import java.util.ArrayList;

public class HackLead extends Person {

    private ArrayList<String> Needed_Skills;
    private String Curr_project;

    public HackLead() {
        super();
        Needed_Skills = new ArrayList<String>();
    }

    public HackLead(String name, String location, String contactInfo) {
        super(name, location, contactInfo);
        Needed_Skills = new ArrayList<String>();
    }

    public ArrayList<String> getNeeded_Skills() {
        return Needed_Skills;
    }

    public void setNeeded_Skills(String needed_Skill) {
        Needed_Skills.add(needed_Skill);
    }

    public String getCurr_project() {
        return Curr_project;
    }

    public void setCurr_project(String curr_project) {
        Curr_project = curr_project;
    }
}
