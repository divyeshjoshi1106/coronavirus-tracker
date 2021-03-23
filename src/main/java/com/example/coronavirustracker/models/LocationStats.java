package com.example.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int previousDayChange;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getPreviousDayChange() {
        return previousDayChange;
    }

    public void setPreviousDayChange(int previousDayChange) {
        this.previousDayChange = previousDayChange;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", previousDayChange=" + previousDayChange +
                '}';
    }
}
