package org.example;

/**
 * Class representing a person in the ride-sharing application.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String destination;

    /**
     * Constructor for creating a person.
     *
     * @param name        The name of the person.
     * @param age         The age of the person.
     * @param destination The destination the person wants to reach.
     */
    public Person(String name, int age, String destination) {
        this.name = name;
        this.age = age;
        this.destination = destination;
    }

    /**
     * Returns the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the destination of the person.
     *
     * @return The destination of the person.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Compares this person with the specified person for order.
     * Returns a negative integer, zero, or a positive integer as this person is less than, equal to,
     * or greater than the specified person, based on their names.
     *
     * @param otherPerson The person to be compared.
     * @return A negative integer, zero, or a positive integer as this person is less than, equal to,
     * or greater than the specified person.
     */
    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.getName());
    }

    /**
     * Returns a string representation of the person.
     *
     * @return A string representation of the person.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", destination='" + destination + '\'' +
                '}';
    }
}
