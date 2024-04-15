#Vehicle Sharing Application
The Vehicle Sharing Application facilitates the arrangement of carpooling, car-sharing, or ride-sharing among a group of people to reach a common destination.

Problem Description
Participants in the arrangement are divided into drivers and passengers, with each person having a specific destination. Drivers are willing to pick up passengers who have the same destination along their route. The goal is to maximize the number of successful matches between drivers and passengers.

Compulsory Features
Maven Project:

Project setup using Maven for easy dependency management.
Object-Oriented Model:

Classes to represent persons (drivers and passengers) and destinations.
Random Person Generation:

Generation of a random group of persons.
Usage of Java streams to filter drivers and passengers.
Driver List Sorting:

All drivers stored in a LinkedList and sorted by their age.
Passenger Set Sorting:

All passengers stored in a TreeSet and sorted by their name.
Homework Features
Problem Description Class:

Class describing the problem and its solution approach.
Java Stream API Usage:

Utilization of Java Stream API to:
Compute a list of destinations that drivers pass through.
Compute a map of destinations and people who want to go there.
Third-Party Library Integration:

Integration of a third-party library to generate random fake names for persons and destinations.
Greedy Algorithm Implementation:

Creation of a greedy algorithm to solve the matching problem efficiently.
