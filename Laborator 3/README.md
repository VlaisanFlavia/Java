Tourist Attraction Application
The Tourist Attraction Application helps tourists plan their visits to various attractions in a city, including tourist sites, concerts, games, etc.

Problem Description
In the city, there are different types of attractions with specific properties such as opening hours and entry fees. The main specifications of the application include:

Compulsory Features 
Object-Oriented Model:

Classes: Trip, Statue, Church, Concert
Natural ordering based on attraction names
Interfaces:

Visitable and Payable interfaces implemented by relevant classes
Trip Class:

Contains city name, time period, and a list of attractions
Creation of at least one object of each class
Homework Features 
Visiting Timetable:

Implementation using a Map with dates as keys and time intervals as values
Time Interval Representation:

Utilization of a pair of LocalTime objects using generics
Sorting Visitables:

Method in Trip class to display visitable locations not payable, sorted by opening hour
Default Methods in Interface:

Visitable interface with default method returning opening hour for a given date
Travel Plan Class:

Creation of TravelPlan class specifying the day for each attraction visit
Printing the travel plan on the screen
