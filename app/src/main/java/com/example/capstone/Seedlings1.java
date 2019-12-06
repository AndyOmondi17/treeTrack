package com.example.capstone;

public class Seedlings1 {
    private String type;
    private String maturationPeriod;
    private String climate;

    public Seedlings1(String type, String maturationPeriod, String climate){
        this.type = type;
        this.maturationPeriod = maturationPeriod;
        this.climate = climate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaturationPeriod() {
        return maturationPeriod;
    }

    public void setMaturationPeriod(String maturationPeriod) {
        this.maturationPeriod = maturationPeriod;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate){
        this.climate = climate;
    }
}
