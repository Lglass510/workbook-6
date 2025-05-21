package com.pluralsight;


public class CustomCollections {
    public static void main(String[] args) {
        FixedList<String> shows = new FixedList<>(4);
        shows.add("Fraiser");
        shows.add("Living Single");
        shows.add("The Wire");
        shows.add("Avatar:The Last Airbender");
        System.out.println(shows.getItems());

        FixedList<Integer> luckyNumbers = new FixedList<>(4);
        luckyNumbers.add(7);
        luckyNumbers.add(2);
        luckyNumbers.add(21);
        luckyNumbers.add(100);
        System.out.println(luckyNumbers.getItems());


        FixedList<Character> grades = new FixedList<>(3);
        grades.add('A');
        grades.add('B');
        grades.add('C');
        System.out.println(grades.getItems());
    }
}
