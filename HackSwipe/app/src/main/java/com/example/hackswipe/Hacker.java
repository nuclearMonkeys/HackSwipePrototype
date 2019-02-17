package com.example.hackswipe;

import com.example.hackswipe.Person;

import java.util.ArrayList;

public class Hacker extends Person {
    public Hacker(String name, String location, String contactInfo) {
        super(name, location, contactInfo);
        Skills = new ArrayList<String>();
    }
    public Hacker() {
        super();
        Skills = new ArrayList<String>();
    }
    private ArrayList<String> Skills;
    private String prev_projects;

    public String getPrev_projects() {
        return prev_projects;
    }

    public void setPrev_projects(String prev_projects) {
        this.prev_projects = prev_projects;
    }


    public ArrayList<String> getSkills() {
        return Skills;
    }
    public void add_A_Skill(String skill){
        this.Skills.add(skill);
    }
}


