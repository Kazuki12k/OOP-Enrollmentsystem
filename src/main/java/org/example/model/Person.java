package org.example.model;

public class Person {

    int PersonID;
    String PersonName;

    public Person(int ID, String Name) {
        this.PersonID = ID;
        this.PersonName = Name;
    }

    public void setPersonID() {
        this.PersonID = PersonID;
    }
    public int getPersonID() {
        return PersonID;
    }

    public void setPersonName() {
        this.PersonName = PersonName;
    }
    public String getPersonName() {
        return PersonName;
    }

}
