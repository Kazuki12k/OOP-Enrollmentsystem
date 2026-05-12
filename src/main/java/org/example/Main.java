package org.example;

import org.example.model.*;
import org.example.service.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Registar registar = new Registar(new StudentRegistration(), new CourseRegistration(), new DepartmentRegistration(), new EnrollmentServiceImpl(), new TuitionFeePayment(), new InstructorServiceImpl(), new SectionRegistration());

        startMenu(scan, registar);
    }
       static void startMenu(Scanner scan, Registar registar){
            while (true) {

                System.out.println("\n=== MAIN MENU ===");
                System.out.println("1. Student");
                System.out.println("2. Instructor");
                System.out.println("3. Department");
                System.out.println("4. Section");
                System.out.println("5. Course");
                System.out.println("6. Exit");

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
                        courseMenu(scan, registar);

                    case 6:
                        System.out.println("Goodbye!");
                        System.exit(0);

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
            System.out.println("5. Enroll Student in Section");
            System.out.println("6. Tuition");
            System.out.println("7. Back");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("Program: ");
                    String program = scan.nextLine();

                    registar.registerStudent(new Student(id, name, program));
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

                    System.out.print("Student ID: ");
                    int sid = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Section Name: ");
                    String secName = scan.nextLine();

                    System.out.print("Course Name: ");
                    String courseName = scan.nextLine();

                    Student student = null;

                    for (Student s : registar.displayStudents()) {

                        if (s.getPersonID() == sid) {
                            student = s;
                            break;
                        }
                    }

                    if (student == null) {
                        System.out.println("Student not found!");
                        break;
                    }

                    Section section = findSection(registar, secName);

                    if (section == null) {
                        System.out.println("Section not found!");
                        break;
                    }

                    Course course = findCourse(registar, courseName);

                    if (course == null) {
                        System.out.println("Course not found");
                    }
                    registar.enrollStudentinSection(student, section, course);

                    System.out.println("Student enrolled successfully!");
                    break;

                case 6:
                    tuitionMenu(scan, registar);
                case 7:
                    startMenu(scan, registar);

                default:
                    System.out.println("Invalid Choice pick again.");
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

                    System.out.print("Course Name: ");
                    String couName = scan.nextLine();

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

                    if (section == null) {
                        System.out.println("Section not found!");
                        break;
                    }

                    Course course = findCourse(registar, couName);

                    if (course == null) {
                        System.out.println("Course not found");
                    }

                        registar.assignInstructortoSection(instructor, section, course);
                    break;

                case 4:
                    startMenu(scan, registar);

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
            System.out.println("3. View Department Hierarchy");
            System.out.println("4. Back");

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

                    System.out.print("Department Name: ");
                    String deptName = scan.nextLine();

                    Department department = null;

                    for (Department d : registar.displayDepartments()) {

                        if (d.getDepartmentName().equalsIgnoreCase(deptName)) {
                            department = d;
                            break;
                        }
                    }

                    if (department == null) {

                        System.out.println("Department not found.");

                    } else {

                        registar.viewDepartmentHierarchy(department);
                    }

                    break;

                case 4:
                    startMenu(scan, registar);

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

                    System.out.print("Course Name: ");
                    String courseName = scan.nextLine();

                    Course course = findCourse(registar, courseName);

                    if (course == null) {
                    System.out.println("Course not found!");
                    break;
                    }

                    Section section = new Section(name, course, new ArrayList<>(), new ArrayList<>());

                    registar.addSection(section);

                    course.getSectionList().add(section);

                    System.out.println("Section added successfully!");
                    break;

                case 2:
                    for (Section s : registar.displaySections()) {
                        System.out.println(s.getSectionName() + " | " + s.getCourse().getCoursename());
                    }
                    break;

                case 3:
                    startMenu(scan, registar);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void courseMenu(Scanner scan, Registar registar) {

        while (true) {

            System.out.println("\n--- COURSE MENU ---");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Delete Course");
            System.out.println("4. Display Courses");
            System.out.println("5. Back");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Course ID: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Course Name: ");
                    String name = scan.nextLine();

                    System.out.print("Course Program: ");
                    String program = scan.nextLine();

                    System.out.print("Department Name: ");
                    String deptName = scan.nextLine();

                    Department dept = findDepartment(registar, deptName);

                    if (dept == null) {
                        System.out.println("Department not found!");
                        break;
                    }

                    Course newCourse = new Course(id, name, program, dept);
                    registar.addCourse(newCourse);
                    dept.getCourseList().add(newCourse);
                    System.out.println("Course added successfully!");
                    break;

                case 2:
                    System.out.print("Course ID to update: ");
                    int uid = scan.nextInt();
                    scan.nextLine();

                    System.out.print("New Course Name: ");
                    String uname = scan.nextLine();

                    System.out.print("New Program: ");
                    String uprogram = scan.nextLine();

                    System.out.print("Department Name: ");
                    String udept = scan.nextLine();

                    Department updatedDept = findDepartment(registar, udept);

                    if (updatedDept == null) {
                        System.out.println("Department not found!");
                        break;
                    }

                    Course updatedCourse = new Course(uid, uname, uprogram, updatedDept);
                    registar.updateCourse(updatedCourse);

                    System.out.println("Course updated!");
                    break;

                case 3:
                    System.out.print("ID: ");
                    int did = scan.nextInt();
                    registar.deleteCourse(new Course(did,"", "",null));
                    break;

                case 4:
                    registar.displayCourses();
                    break;

                case 5:
                    startMenu(scan, registar);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void tuitionMenu(Scanner scan, Registar registar) {

        double tuition = 0;
        double paid = 0;

        while (true) {
            System.out.println("\n=== TUITION MENU ===");
            System.out.println("1. Calculate Tuition");
            System.out.println("2. Make Payment");
            System.out.println("3. Check Balance");
            System.out.println("4. Check Status");
            System.out.println("0. Back");

            int choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Units: ");
                    double units = scan.nextDouble();

                    System.out.print("Discount rate (0 if none): ");
                    double discount = scan.nextDouble();

                    tuition = registar.calculateTuitionFee(units, discount);
                    paid = 0;

                    System.out.println("Tuition computed: " + tuition);
                    break;

                case 2:
                    System.out.print("Payment amount: ");
                    double amount = scan.nextDouble();

                    paid += amount;

                    System.out.println("Payment recorded.");
                    break;

                case 3:
                    double balance = registar.getBalance(tuition, paid);
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    double bal = registar.getBalance(tuition, paid);

                    if (registar.isFullyPaid(bal)) {
                        System.out.println("FULLY PAID");
                    } else {
                        System.out.println("NOT FULLY PAID");
                    }
                    break;

                case 0:
                    studentMenu(scan, registar);

                default:
                    System.out.println("Invalid choice.");
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

    static Department findDepartment(Registar registar, String deptName) {

        for (Department d : registar.displayDepartments()) {
            if (d.getDepartmentName().equalsIgnoreCase(deptName)) {
                return d;
            }
        }

        return null;
    }

    static Course findCourse(Registar registar, String courseName) {

        for (Course c : registar.displayCourses()) {
            if (c.getCoursename().equalsIgnoreCase(courseName)) {
                return c;
            }
        }

        System.out.println("Course not found!");
        return null;
    }
}