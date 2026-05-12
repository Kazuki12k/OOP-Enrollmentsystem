package org.example.model;

import java.util.List;

public class Instructor extends Person{

    public Instructor(int PersonID, String PersonName) {
        super(PersonID, PersonName);
    }


    @Override
    public void setPersonID() {
        super.setPersonID();
    }

    @Override
    public int getPersonID() {
        return super.getPersonID();
    }

    @Override
    public void setPersonName() {
        this.PersonName = PersonName;
    }
    @Override
    public String getPersonName() {
        return PersonName;
    }

}
