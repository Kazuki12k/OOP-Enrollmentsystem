package org.example;

import org.example.model.*;
import org.example.service.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Registar registar = new Registar(new StudentRegistration(), new CourseRegistration(), new DepartmentRegistration(), new EnrollmentServiceImpl(), new TuitionFeePayment(), new InstructorServiceImpl(), new SectionRegistration());

        while (true) {

            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Student");
            System.out.println("2. Instructor");
            System.out.println("3. Department");
            System.out.println("4. Section");
            System.out.println("5. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    studentMenu(scan, registar);
                    break;

                case 2:
                    instructorMenu(scan, registar);
                    break;

                case 3:
                    departmentMenu(scan, registar);
                    break;

                case 4:
                    sectionMenu(scan, registar);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void studentMenu(Scanner scan, Registar registar) {

        while (true) {

            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. Register Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Back");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("Course: ");
                    String course = scan.nextLine();

                    registar.registerStudent(new Student(id, name, course));
                    break;

                case 2:
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
                    return;
            }
        }
    }

    static void instructorMenu(Scanner scan, Registar registar) {

        while (true) {

            System.out.println("\n--- INSTRUCTOR MENU ---");
            System.out.println("1. Add Instructor");
            System.out.println("2. Display Instructors");
            System.out.println("3. Assign to Section");
            System.out.println("4. Back");

            int choice = scan.nextInt();
            scan.nextLine();

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
                    String sectionName = scan.nextLine();

                    Instructor instructor = null;

                    for (Instructor i : registar.getInstructordetails()) {
                        if (i.getPersonID() == iid) {
                            instructor = i;
                            break;
                        }
                    }

                    if (instructor == null) {
                        System.out.println("Instructor not found");
                        break;
                    }

                    Section section = findSection(registar, sectionName);

                    if (section != null) {
                        registar.assignInstructortoSection(instructor, section);
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void departmentMenu(Scanner scan, Registar registar) {

        while (true) {

            System.out.println("\n--- DEPARTMENT MENU ---");
            System.out.println("1. Add Department");
            System.out.println("2. Display Departments");
            System.out.println("3. Back");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();

                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    registar.saveDepartment(new Department(id, name));
                    break;

                case 2:
                    for (Department d : registar.displayDepartments()) {
                        System.out.println(d.getDepartmentID() + " | " + d.getDepartmentName());
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void sectionMenu(Scanner scan, Registar registar) {

        while (true) {

            System.out.println("\n--- SECTION MENU ---");
            System.out.println("1. Add Section");
            System.out.println("2. Display Sections");
            System.out.println("3. Back");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Section Name: ");
                    String name = scan.nextLine();

                    System.out.print("Department Name: ");
                    String dept = scan.nextLine();

                    registar.addSection(new Section(
                            name,
                            dept,
                            new ArrayList<>(),
                            new ArrayList<>()
                    ));
                    break;

                case 2:
                    for (Section s : registar.displaySections()) {
                        System.out.println(s.getSectionName() + " | " + s.getDepartmentName());
                    }
                    break;

                case 3:
                    return;
            }
        }
    }

    static Section findSection(Registar registar, String sectionName) {

        for (Section s : registar.displaySections()) {
            if (s.getSectionName().equalsIgnoreCase(sectionName)) {
                return s;
            }
        }

        System.out.println("Section not found!");
        return null;
    }
}