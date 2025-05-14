package com.pluralsight;


public class CustomCollections {
    public static void main(String[] args) {
        FixedList<String> shows = new FixedList<>(4);
        shows.add("Fraiser");
        shows.add("Living Single");
        shows.add("The Wire");
        shows.add("Avatar:The Last Airbender");

        System.out.println(shows.getItems());
    }
}
