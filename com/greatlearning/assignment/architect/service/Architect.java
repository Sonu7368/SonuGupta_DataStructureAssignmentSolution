package com.greatlearning.assignment.architect.service;

import com.greatlearning.assignment.architect.utility.LinkedList;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Architect {

    public static TreeMap<Integer, Integer> getFloorSchedule() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total no. of floors in the building: ");
        int totalFloors = sc.nextInt();

        TreeMap<Integer, Integer> floorSchedule = new TreeMap<>(Collections.reverseOrder());

        // here floorSchedule[x] will represent the day on which floor x is given by factory
        for (int day = 1; day <= totalFloors; day++) {
            System.out.println("Enter the floor size given on day: " + day);
            int floorSize = sc.nextInt();
            floorSchedule.put(floorSize, day);
        }

        sc.close();
        return floorSchedule;
    }

    public static LinkedList[] getFloorPlan(TreeMap<Integer, Integer> floorSchedule) {
        LinkedList[] floorPlan = new LinkedList[floorSchedule.size() + 1];

        int constructionDay = 0;

        for (Integer floorSize : floorSchedule.keySet()) {
            int dayOfArrivalOfFloor = floorSchedule.get(floorSize);

            if (constructionDay < dayOfArrivalOfFloor)
                constructionDay = dayOfArrivalOfFloor;

            if (floorPlan[constructionDay] == null)
                floorPlan[constructionDay] = new LinkedList();

            floorPlan[constructionDay].insert(floorSize);
        }

        return floorPlan;
    }

}
