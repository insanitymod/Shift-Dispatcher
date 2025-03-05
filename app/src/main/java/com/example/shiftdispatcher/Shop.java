package com.example.shiftdispatcher;

public class Shop {

    private String name;
    private String openingTime;  // Format "HH:mm",
    private String closingTime;  // Format "HH:mm",
    private int requiredStaffPerShift;

    // Constructeur
    public Shop(String name, String openingTime, String closingTime, int requiredStaffPerShift) {
        this.name = name;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.requiredStaffPerShift = requiredStaffPerShift;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public int getRequiredStaffPerShift() {
        return requiredStaffPerShift;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public void setRequiredStaffPerShift(int requiredStaffPerShift) {
        this.requiredStaffPerShift = requiredStaffPerShift;
    }

    // Méthode pour afficher les infos du shop
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", openingTime='" + openingTime + '\'' +
                ", closingTime='" + closingTime + '\'' +
                ", requiredStaffPerShift=" + requiredStaffPerShift +
                '}';
    }

}
