import java.util.Comparator;
/**
 * This class describe the Company part of the problem
 */
public class Company implements Node{

    private String name;

    /**
     * This is the default constructor
     */
    public Company(){
        this.name = "";
    }

    /**
     * @param name : the name we associate with the company
     */
    public Company(String name){

        this.name = name;
    }

    /**
     * This method sets the name for company
     * @param name : the name we associate with the company
     */

    public void setName(String name) {

        this.name = name;
    }

    /**
     * This method returns the name of the company
     * @return this.name : returns the name of the company
     */

    public String getName(){

        return this.name;
    }

    public int compareTo(Company company){

        return this.name.compareTo(company.getName());

    }

    public String toString() {
        return "Name: " + this .name;
    }

}
