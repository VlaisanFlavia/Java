import java.util.Comparator;

/**
 * This class describe the Person part of the problem
 */
public class Person implements Node{

    private String name;

    /**
     * This is the default constructor
     */
    public Person(){
        this.name = "";
    }

    /**
     * @param name : the name we associate with the person
     */
    public Person(String name){

        this.name = name;
    }

    /**
     * This method sets the name for person
     * @param name : the name we associate with the person
     */

    public void setName(String name) {

        this.name = name;
    }

    /**
     * This method returns the name of the person
     * @return this.name : returns the name of the person
     */

    public String getName(){

        return this.name;
    }

    public int compareTo(Person person){

        return this.name.compareTo(person.getName());

    }

    public String toString() {
        return "Name: " + this .name;
    }


}
