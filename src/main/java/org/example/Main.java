package org.example;

import org.example.model.*;
import org.example.service.*;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Course> courseList = new ArrayList<>();
        List<Instructor> instructorList = new ArrayList<>();
        List<Section> sectionList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        Registar registar = new Registar(new StudentRegistration(), new CourseRegistration(), new DepartmentRegistration(), new EnrollmentServiceImpl(), new TuitionFeePayment(), new InstructorServiceImpl());

        startMenu(scan, registar);

    }

    static void startMenu(Scanner scan, Registar registar) {
        System.out.println("WELCOME TO ENROLLMENT SYSTEM");
        System.out.println("----------------------------");
        System.out.println("PLEASE SELECT MENU");
        System.out.println("    1.Student");
        System.out.println("    2.Instructor");
        System.out.println("    3.Department");
        System.out.println("    4.Exit");
        System.out.println("----------------------------");

        int ans = scan.nextInt();

        switch(ans){

            case 1:
                studentMenu(scan, registar);
            case 2:
                instructorMenu(scan, registar);

            case 3:
                // Department
            case 4:
                System.exit(0);
        }
    }

    static void studentMenu(Scanner scan, Registar registar){

        while(true) {

            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. Register Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Enroll Student in Section");
            System.out.println("6. Back");

            System.out.print("Choice: ");
            int choice = scan.nextInt();

            switch (choice) {

                case 1:

                    scan.nextLine();

                    System.out.print("ID: ");
                    int id = scan.nextInt();

                    scan.nextLine();

                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("Course: ");
                    String course = scan.nextLine();

                    Student student =
                            new Student(id, name, course);

                    registar.registerStudent(student);

                    System.out.println("Student Registered");
                    break;

                case 2:

                    scan.nextLine();

                    System.out.print("Enter ID to update: ");
                    int uid = scan.nextInt();

                    scan.nextLine();

                    System.out.print("New Name: ");
                    String uname = scan.nextLine();

                    System.out.print("New Course: ");
                    String ucourse = scan.nextLine();

                    Student updatedStudent =
                            new Student(uid, uname, ucourse);

                    registar.updateStudentRecord(updatedStudent);

                    System.out.println("Student Updated");
                    break;

                case 3:

                    scan.nextLine();

                    System.out.print("Enter ID to delete: ");
                    int did = scan.nextInt();

                    Student deleteStudent =
                            new Student(did, "", "");

                    registar.deleteStudentRecord(deleteStudent);

                    System.out.println("Student Deleted");
                    break;

                case 4:

                    registar.displayStudents();
                    break;

                case 5:

                    scan.nextLine();

                    System.out.print("Student ID: ");
                    int sid = scan.nextInt();

                    scan.nextLine();

                    System.out.print("Student Name: ");
                    String sname = scan.nextLine();

                    System.out.print("Course: ");
                    String scourse = scan.nextLine();

                    Student enrolledStudent =
                            new Student(sid, sname, scourse);

                    System.out.print("Section Name: ");
                    String sectionName = scan.nextLine();

                    System.out.print("Department Name: ");
                    String departmentName = scan.nextLine();

                    List<Student> studentList =
                            new ArrayList<>();

                    List<Instructor> instructorList =
                            new ArrayList<>();

                    Section section = new Section(
                            sectionName,
                            studentList,
                            instructorList
                    );

                    registar.enrollStudentinSection(
                            enrolledStudent,
                            section,
                            studentList
                    );

                    break;

                case 6:
                    startMenu(scan, registar);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void instructorMenu(Scanner scan, Registar registar) {

        while (true) {
            System.out.println("\n--- INSTRUCTOR MENU ---");
            System.out.println("1. Add Instructor");
            System.out.println("2. Update Instructor");
            System.out.println("3. Delete Instructor");
            System.out.println("4. Display Instructors");
            System.out.println("5. Assign Instructor to Section");
            System.out.println("6. Back");
            System.out.print("Choose: ");

            int choice = scan.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Instructor ID: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Instructor Name: ");
                    String name = scan.nextLine();

                    Instructor instructor = new Instructor(id, name);

                    registar.addInstructor(instructor);
                    System.out.println("Instructor added!");
                }

                case 2 -> {
                    System.out.print("Instructor ID to update: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("New Name: ");
                    String name = scan.nextLine();

                    Instructor updated = new Instructor(id, name);

                    // You need update method in service (see note below)
                    System.out.println("Update logic needed in service layer");
                }

                case 3 -> {
                    System.out.print("Instructor ID to delete: ");
                    int id = scan.nextInt();

                    Instructor temp = new Instructor(id, "");

                    // You need delete method in service
                    System.out.println("Delete logic needed in service layer");
                }

                case 4 -> {
                    for (Instructor i : registar.getInstructordetails()) {
                        System.out.println(i.getPersonID() + " - " + i.getPersonName());
                    }
                }

                case 5 -> {
                    System.out.print("Instructor ID: ");
                    int id = scan.nextInt();

                    System.out.print("Section Name: ");
                    scan.nextLine();
                    String sectionName = scan.nextLine();

                    Instructor instructor = new Instructor(id, "");
                    Section section = new Section(sectionName, new ArrayList<>(), new ArrayList<>());

                    registar.assignInstructortoSection(instructor, section, new ArrayList<>());

                    System.out.println("Instructor assigned!");
                }

                case 6 -> {
                    startMenu(scan, registar);
                }

            }
        }
    }
}
