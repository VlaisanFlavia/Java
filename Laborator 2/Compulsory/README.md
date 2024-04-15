Vehicle Routing Problem (VRP) Application
The Vehicle Routing Problem (VRP) application is designed to solve the problem of efficiently allocating clients to vehicles for delivery routes.

Problem Description
An instance of the VRP consists of depots, vehicles, and clients with specific time intervals for visitation. The main specifications of the application include:

Compulsory Features 
Object-Oriented Model:

Classes: Depot, Vehicle, Client
Enum: Regular and Premium client types
Proper constructors, getters, and setters for each class
Overridden toString() method for all classes
Object Creation and Printing:

Create objects for each class and print them on the screen
Homework Features
Problem and Solution Classes:

Classes to describe the problem and its solution
Equals Method Override:

Override equals() method for Depot, Vehicle, and Client classes to prevent duplicates
Vehicle Types:

Dedicated classes for trucks and drones
Abstract Vehicle class with properties for trucks (capacity) and drones (maximum flight duration)
Problem Class Implementation:

Implement getVehicles() method in the Problem class to return an array of all vehicles from all depots
Travel Times:

Assume known travel times between locations
Implementation of a simple greedy algorithm for allocating clients to vehicles
Documentation:

Write doc comments in the source code
Generate class documentation using Javadoc
