package org.example.model;

public class Person {

    String PersonID;
    String PersonName;

    public Person(String ID, String Name) {
        this.PersonID = ID;
        this.PersonName = Name;
    }

    public void setPersonID() {
        this.PersonID = PersonID;
    }
    public String getPersonID() {
        return PersonID;
    }

    public void setPersonName() {
        this.PersonName = PersonName;
    }
    public String getPersonName() {
        return PersonName;
    }

}
