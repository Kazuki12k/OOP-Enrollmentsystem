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

    static void studentMenu(Scanner scan, Registar registar) {

        while (true) {

            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. Register Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Enroll Student in Section");
            System.out.println("6. Back");

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

                    registar.registerStudent(new Student(id, name, course));
                    System.out.println("Student Registered");
                    break;

                case 2:
                    scan.nextLine();

                    System.out.print("ID: ");
                    int uid = scan.nextInt();
                    scan.nextLine();

                    System.out.print("New Name: ");
                    String uname = scan.nextLine();

                    System.out.print("New Course: ");
                    String ucourse = scan.nextLine();

                    registar.updateStudentRecord(new Student(uid, uname, ucourse));
                    break;

                case 3:
                    System.out.print("ID: ");
                    int did = scan.nextInt();

                    registar.deleteStudentRecord(new Student(did, "", ""));
                    break;

                case 4:
                    registar.displayStudents();
                    break;

                case 5:
                    scan.nextLine();

                    System.out.print("Student ID: ");
                    int sid = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Name: ");
                    String sname = scan.nextLine();

                    System.out.print("Course: ");
                    String scourse = scan.nextLine();

                    Student student = new Student(sid, sname, scourse);

                    System.out.print("Section Name: ");
                    String sectionName = scan.nextLine();

                    System.out.print("Department Name: ");
                    String departmentName = scan.nextLine();

                    registar.enrollStudentinSection(student, sectionName, departmentName);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void instructorMenu(Scanner scan, Registar registar) {

        while (true) {

            System.out.println("\n--- INSTRUCTOR MENU ---");
            System.out.println("1. Add Instructor");
            System.out.println("2. Display Instructors");
            System.out.println("3. Assign Instructor to Section");
            System.out.println("4. Back");

            int choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    registar.addInstructor(new Instructor(id, name));
                    break;

                case 2:
                    for (Instructor i : registar.getInstructordetails()) {
                        System.out.println(i.getPersonID() + " - " + i.getPersonName());
                    }
                    break;

                case 3:
                    System.out.print("Instructor ID: ");
                    int iid = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Section Name: ");
                    String section = scan.nextLine();

                    registar.assignInstructortoSection(new Instructor(iid, ""), section);
                    break;

                case 4:
                    startMenu(scan, registar);
            }
        }
    }
    public static void departmentMenu(Scanner scan, Registar registar) {

        while (true) {
            System.out.println("\n--- DEPARTMENT MENU ---");
            System.out.println("1. Add Department");
            System.out.println("2. Update Department");
            System.out.println("3. Delete Department");
            System.out.println("4. Display Departments");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Department ID: ");
                    String id = scan.nextLine();

                    System.out.print("Enter Department Name: ");
                    String name = scan.nextLine();

                    Department dept = new Department(id, name);
                    registar.saveDepartment(dept);

                    System.out.println("Department added.");
                }

                case 2 -> {
                    System.out.print("Enter Department ID to update: ");
                    String id = scan.nextLine();

                    System.out.print("New Department Name: ");
                    String name = scan.nextLine();

                    Department dept = new Department(id, name);
                    registar.updateDepartment(dept);

                    System.out.println("Department updated.");
                }

                case 3 -> {
                    System.out.print("Enter Department ID to delete: ");
                    String id = scan.nextLine();

                    Department dept = new Department(id, "");
                    registar.deleteDepartment(dept);

                    System.out.println("Department deleted.");
                }

                case 4 -> {
                    System.out.println("\n--- DEPARTMENTS ---");
                    for (Department d : registar.displayDepartments()) {
                        System.out.println(d.getDepartmentID() + " | " + d.getDepartmentName());
                    }
                }

                case 5 -> {
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
