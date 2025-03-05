package com.example.shiftdispatcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ScheduleGenerator {

    // Méthode principale pour générer le planning
    public List<Shift> generateSchedule(List<Agent> agents, Shop shop) {
        List<Shift> schedule = new ArrayList<>();
        String[] daysOfWeek = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

        int openingHour = parseHour(shop.getOpeningTime());
        int closingHour = parseHour(shop.getClosingTime());

        int totalHoursPerDay = closingHour - openingHour;

        // Mélange les agents pour varier la répartition
        Collections.shuffle(agents);

        for (String day : daysOfWeek) {
            List<Agent> assignedAgents = new ArrayList<>();

            for (Agent agent : agents) {
                if (agent.getTotalHoursPerWeek() >= totalHoursPerDay) {
                    assignedAgents.add(agent);
                    agent.setTotalHoursPerWeek(agent.getTotalHoursPerWeek() - totalHoursPerDay);
                }

                if (assignedAgents.size() == shop.getRequiredStaffPerShift()) {
                    break;
                }
            }

            Shift shift = new Shift(
                    day,
                    shop.getOpeningTime(),
                    shop.getClosingTime(),
                    assignedAgents
            );

            schedule.add(shift);
        }

        return schedule;
    }

    private int parseHour(String time) {
        return Integer.parseInt(time.split(":")[0]);
    }
}
