package org.example;

import java.util.*;
import java.util.stream.Collectors;
import com.github.javafaker.Faker;

public class RideSharing {

    public static void main(String[] args) {
        // Generate people and separate drivers and passengers
        List<Person> people = generatePeople();
        List<Person> drivers = people.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        Set<Person> passengers = people.stream()
                .filter(person -> person.getAge() < 18)
                .collect(Collectors.toCollection(TreeSet::new));

        // Match passengers with drivers using greedy algorithm
        Map<Person, Person> matches = matchPassengersWithDrivers(drivers, passengers);

        // Print the matches
        System.out.println("Matches (Driver -> Passenger):");
        matches.forEach((driver, passenger) -> {
            System.out.println(driver + " -> " + passenger);
        });
    }

    // Greedy algorithm to match passengers with drivers
    private static Map<Person, Person> matchPassengersWithDrivers(List<Person> drivers, Set<Person> passengers) {
        Map<Person, Person> matches = new HashMap<>();

        for (Person passenger : passengers) {
            Person bestDriver = null;
            int minDistance = Integer.MAX_VALUE;

            for (Person driver : drivers) {
                if (driver.getDestination().equals(passenger.getDestination())) {
                    int distance = computeDistance(driver, passenger); // Assume you have a method to compute distance
                    if (distance < minDistance) {
                        minDistance = distance;
                        bestDriver = driver;
                    }
                }
            }

            if (bestDriver != null) {
                matches.put(bestDriver, passenger);
                drivers.remove(bestDriver); // Remove the matched driver
            }
        }

        return matches;
    }

    // Method to compute distance (for illustration purposes)
    private static int computeDistance(Person driver, Person passenger) {
        // Assume you have a method to compute distance between two locations
        // This could be based on geographical coordinates or other metrics
        // For simplicity, let's return a random distance between 0 and 100
        return new Random().nextInt(100);
    }

    // Generate random people
    private static List<Person> generatePeople() {
        List<Person> people = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            String name = faker.name().fullName();
            int age = faker.number().numberBetween(10, 60);
            String destination = "City " + (char) ('A' + i % 5); // Generates cities A, B, C, D, E
            people.add(new Person(name, age, destination));
        }
        return people;
    }
}
