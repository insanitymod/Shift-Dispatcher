package com.example.shiftdispatcher;

public class Agent {

    private String id;
    private String name;
    private int totalHoursPerWeek;

    // Constructeur
    public Agent(String id, String name, int totalHoursPerWeek) {
        this.id = id;
        this.name = name;
        this.totalHoursPerWeek = totalHoursPerWeek;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalHoursPerWeek() {
        return totalHoursPerWeek;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalHoursPerWeek(int totalHoursPerWeek) {
        this.totalHoursPerWeek = totalHoursPerWeek;
    }

    // Méthode utilitaire pour afficher les infos de l'agent
    @Override
    public String toString() {
        return "Agent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", totalHoursPerWeek=" + totalHoursPerWeek +
                '}';
    }
}
