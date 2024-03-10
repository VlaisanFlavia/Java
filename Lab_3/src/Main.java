import  java.util.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person john = new Person("John");
        persons.add(john);

        persons.add(new Person("Matthew"));
        persons.add(new Person("Martin"));

        for (Person person: persons) {
            System.out.println(person);
        }

        ArrayList<Company> companies = new ArrayList<>();

        Company company1 = new Company("company1");
        companies.add(company1);

        companies.add(new Company("company2"));
        companies.add(new Company("company3"));

        for (Company company: companies) {
            System.out.println(company);
        }


    }
}