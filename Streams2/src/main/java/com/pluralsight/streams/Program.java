package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

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

        List<Person> matched = people.stream()
                .filter(person ->
                        person.getFirstName().toUpperCase().contains(inputName) ||
                        person.getLastName().toUpperCase().contains(inputName))
                .toList();

        double averageAge = people.stream()
                .mapToInt(Person :: getAge)
                .average()
                .orElse(0.0);

        int oldest = people.stream()
                .mapToInt(Person :: getAge)
                .max()
                .orElse(-1);

        int youngest = people.stream()
                .mapToInt(Person :: getAge)
                .min()
                .orElse(-1);

        System.out.printf("\nAverage age: %.2f%n", averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

    }
}
