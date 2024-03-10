public class Project implements Comparable<Project> {
    private String name;

    /**
     * Constructor
     * @param name : sets the name of current project
     */

    public Project(String name) {
        this.name = name;
    }

    /**
     *  This method sets the name of project
     * @param name : sets the name of project
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * This method returns the name of project
     * @return : the name of project
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
    public int compareTo(Project other) {
        return this.name.compareTo(other.name);
    }
}