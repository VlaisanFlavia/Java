****************************************
*     Tourist Attraction Application   *
****************************************

**Problem Description**

The Tourist Attraction Application helps tourists plan their visits to various attractions in a city, including tourist sites, concerts, games, etc.

**Compulsory Features**

1. **Object-Oriented Model:**
   - Classes: Trip, Statue, Church, Concert
   - Natural ordering based on attraction names

2. **Interfaces:**
   - Visitable and Payable interfaces implemented by relevant classes

3. **Trip Class:**
   - Contains city name, time period, and a list of attractions
   - Creation of at least one object of each class

**Homework Features**

1. **Visiting Timetable:**
   - Implementation using a Map with dates as keys and time intervals as values

2. **Time Interval Representation:**
   - Utilization of a pair of LocalTime objects using generics

3. **Sorting Visitables:**
   - Method in Trip class to display visitable locations not payable, sorted by opening hour

4. **Default Methods in Interface:**
   - Visitable interface with default method returning opening hour for a given date

5. **Travel Plan Class:**
   - Creation of TravelPlan class specifying the day for each attraction visit
   - Printing the travel plan on the screen

