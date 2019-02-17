package com.example.hackswipe;


public class Cards {

    private Hacker member = new Hacker();
    private HackLead leader = new HackLead();

    private String name;
    private String Description;
    private String Skills;
    private int image;

    public Cards(String name, String description, String skills, int image, Hacker member, HackLead leader) {
        this.member = member;
        this.leader = leader;
        this.name = name;
        Description = description;
        Skills = skills;
        this.image = image;
    }
    public Cards(String name, String description, String skills, int image) {
        this.name = name;
        Description = description;
        Skills = skills;
        this.image = image;
    }

    public Hacker getMember() {
        return member;
    }
/*
    public void setMember(Hacker member) {
        this.member = member;
    }
*/
    public HackLead getLeader() {
        return leader;
    }
/*8888888888888
    public void setLeader(HackLead leader) {
        this.leader = leader;
    }
88888888888*/
    public String getcardName() {
        return name;
    }

    public void setcardName(String name) {
        this.name = name;
    }

    public String getcardDescription() {
        return Description;
    }

    public void setcardDescription(String description) {
        Description = description;
    }

    public String getcardSkill() {
        return Skills;
    }

    public void setcardSkill(String skill) {
        Skills = skill;
    }

    public int getcardImage() {
        return image;
    }

    public void setcardImage(int image) {
        this.image = image;
    }
}
