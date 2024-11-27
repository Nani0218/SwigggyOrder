package com.neoteric.transitivedemo.swiggy;

import java.util.List;

public class ResturentTest {
    public static void main(String[] args) {
        WeeklyRestaurantOrderTracker tracker = new WeeklyRestaurantOrderTracker();

        tracker.recordOrder("Monday", "Burger");
        tracker.recordOrder("Monday", "Pizza");
        tracker.recordOrder("Tuesday", "Burger");
        tracker.recordOrder("Wednesday", "Pizza");
        tracker.recordOrder("Wednesday", "Pasta");
        tracker.recordOrder("Thursday", "Pizza");
        tracker.recordOrder("Friday", "Soda");
        tracker.recordOrder("Friday", "Burger");
        tracker.recordOrder("Saturday", "Burger");
        tracker.recordOrder("Saturday", "Pasta");
        tracker.recordOrder("Sunday", "Burger");
        tracker.recordOrder("Sunday", "Pizza");
        tracker.recordOrder("Sunday", "Soda");

        tracker.displayWeeklyOrders();

        String mostOrdersDay = tracker.getDayWithMostOrders();
        System.out.println("\nDay with most orders: " + mostOrdersDay);

        String leastOrdersDay = tracker.getDayWithLeastOrders();
        System.out.println("Day with least orders: " + leastOrdersDay);

        int highDemandThreshold = 3;
        int lowDemandThreshold = 2;

        List<String> highDemandItems = tracker.getHighDemandItems(highDemandThreshold);
        System.out.println("\nHigh-demand items (ordered more than " + highDemandThreshold + " times):");
        for (String item : highDemandItems) {
            System.out.println(item);
        }

        List<String> lowDemandItems = tracker.getLowDemandItems(lowDemandThreshold);
        System.out.println("\nLow-demand items (ordered less than " + lowDemandThreshold + " times):");
        for (String item : lowDemandItems) {
            System.out.println(item);
        }
    }

}
