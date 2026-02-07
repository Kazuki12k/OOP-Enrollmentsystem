package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student.setName("John Doe");
        Student.setIDnumber(000123);
        Student.setProgram("Information Technology");

        System.out.println(student1);


    }
}
