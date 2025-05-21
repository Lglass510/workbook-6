package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> people = Arrays.asList(
                new Person("Harry", "Potter", 17),
                new Person("Hermione", "Granger", 17),
                new Person("Ron", "Weasley", 17),
                new Person("Draco", "Malfoy", 18),
                new Person("Luna", "Lovegood", 15),
                new Person("Neville", "Longbottom", 18),
                new Person("Severus", "Snape", 45),
                new Person("Albus", "Dumbledoor", 77),
                new Person("Minerva", "McGonagall", 74),
                new Person("Sirus", "Black", 45)
        );

        System.out.println("Enter a name to search: ");
        String inputName = sc.nextLine().toUpperCase();

        List<Person> matched = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().toUpperCase().contains(inputName) ||
                    person.getLastName().toUpperCase().contains(inputName)) {
                matched.add(person);
            }
        }
        if (matched.isEmpty()) {
            System.out.println("You sure that's a Harry Potter character?");
        } else {
            System.out.println("\nMatching people:");
            for (Person m : matched) {
                System.out.println(m.getFirstName() + ", " + m.getLastName() + ", " + m.getAge());
            }

        }

        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;

            if (age > oldest) {
                oldest = age;
            }
            if (age < youngest) {
                youngest = age;
            }
        }

        double averageAge = (double) totalAge / people.size();


    }
}
