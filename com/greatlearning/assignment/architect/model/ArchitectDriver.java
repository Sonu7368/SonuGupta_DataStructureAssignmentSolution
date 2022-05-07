package com.greatlearning.assignment.architect.model;

import com.greatlearning.assignment.architect.service.Architect;
import com.greatlearning.assignment.architect.utility.LinkedList;

import java.util.TreeMap;

public class ArchitectDriver {
    public static void main(String[] args) {
        // floorSchedule is map with key: floorSize and value: day
        TreeMap<Integer, Integer> floorSchedule = Architect.getFloorSchedule();

        // floorPlan is construction plan where
        // floorPlan[i] is list of floorSize to be constructed on day i
        LinkedList[] floorPlan = Architect.getFloorPlan(floorSchedule);

        System.out.println("\n\nThe order of construction is as follows:\n");

        // floorPlan[0] is always null
        for (int i = 1; i < floorPlan.length; i++) {
            System.out.println("Day: " + i);
            System.out.println(floorPlan[i] != null ? floorPlan[i] : "");
        }
    }
}
