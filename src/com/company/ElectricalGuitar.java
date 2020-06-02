package com.company;

public class ElectricalGuitar {

    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        if(aBrand.length() > 0) {
            brand = aBrand;
        }
    }

    public int getNoOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        if(num>=0){
            numOfPickups = num;
        }
    }

    public boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }


}
