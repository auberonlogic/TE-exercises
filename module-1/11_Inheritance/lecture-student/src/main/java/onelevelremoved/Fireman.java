package onelevelremoved;

import com.techelevator.Person;

public class Fireman extends Person {

    private String workplace;

    public Fireman(String firstName, String lastName, int age, String workplace){
        super();
        this.workplace = workplace;

        // with String firstName access set to protected in Person, can still access the field in a package that parallel with the package containing the package containing Person. cool.
//        this.firstName = firstName;
    }
}
