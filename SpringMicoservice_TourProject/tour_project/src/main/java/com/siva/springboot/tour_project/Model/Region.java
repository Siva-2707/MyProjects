package com.siva.springboot.tour_project.Model;

public enum Region{
    CentralCoast("Central Coast"),
    NorthernCalifornia("Northern California"),
    SouthernCalifornia("Southern California"),
    Varies("Varies");

    private String label;

    private Region(String label){ 
        this.label = label;
    }

    public static Region findByLabel(String byLabel){
        for (Region region : Region.values()) {
            if(region.label.equalsIgnoreCase(byLabel))
                return region;
        }
        return null;
    }



}