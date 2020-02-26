package edu.cscc;

public class PersonAddress extends Address{


    private String personname;

    public PersonAddress(String streetAddress, String city, String state, String zip, String personname) {
        super(streetAddress, city, state, zip);
        this.personname = personname;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    @Override
    public void printLabel() {
        System.out.println(getPersonname());
        System.out.println(getStreetAddress());
        System.out.println(getCity() + ", " + getState() + "  " + getZip());

    }
}
