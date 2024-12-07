package com.klu.JFSD_exam;

public class Main {
  
    private int id;

    private String name;

    private String location;

    private String hodName;

    public Main() {
    }

    public Main(String name, String location, String hodName) {
        this.name = name;
        this.location = location;
        this.hodName = hodName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }
}

