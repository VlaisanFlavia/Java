import java.util.*;
public class Student implements Comparable<Student> {
    private String name;

    /**
     * Constructor
     * @param name: sets the name of current student
     */

    public Student(String name) {
        this.name = name;
    }

    /**
     * This method sets the name of project
     * @param name : sets the name of student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the name of student
     * @return the name of student
     */

    public String getName() {
        return name;
    }

    /**
     * This method ensures us that the objects of this class are comparable
     * @param other the object to be compared.
     * @return
     */

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}