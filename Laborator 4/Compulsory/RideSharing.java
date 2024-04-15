package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class representing the ride-sharing application.
 */
public class RideSharing {
    /**
     * Main method of the ride-sharing application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        List<Person> people = generatePeople();

        List<Person> drivers = people.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());


        Set<Person> passengers = people.stream()
                .filter(person -> person.getAge() < 18)
                .collect(Collectors.toCollection(TreeSet::new));

        drivers.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);

        System.out.println();

        passengers.forEach(System.out::println);
    }

    /**
     * Generates a list of people.
     *
     * @return A list of people.
     */
    private static List<Person> generatePeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "City A"));
        people.add(new Person("Bob", 30, "City B"));
        people.add(new Person("Charlie", 20, "City A"));
        people.add(new Person("David", 16, "City B"));
        people.add(new Person("Emma", 18, "City C"));
        people.add(new Person("Frank", 40, "City A"));
        people.add(new Person("Grace", 14, "City C"));
        return people;
    }
}
