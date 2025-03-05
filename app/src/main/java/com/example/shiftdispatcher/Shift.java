package com.example.shiftdispatcher;
import java.util.List;


public class Shift {

    private String day;
    private String startTime;
    private String endTime;
    private List<Agent> assignedAgents;

    public Shift(String day, String startTime, String endTime, List<Agent> assignedAgents) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.assignedAgents = assignedAgents;
    }


    // Getters
    public String getDay() {
        return day;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public List<Agent> getAssignedAgents() {
        return assignedAgents;
    }

    // Setters
    public void setDay(String day) {
        this.day = day;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setAssignedAgents(List<Agent> assignedAgents) {
        this.assignedAgents = assignedAgents;
    }

    // Méthode utilitaire
    @Override
    public String toString() {
        return "Shift{" +
                "day='" + day + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", assignedAgents=" + assignedAgents +
                '}';
    }
}
