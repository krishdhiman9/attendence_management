package com.attendance;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        AttendanceManager manager = new AttendanceManager();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n==================================");
            System.out.println("  Attendance Management System");
            System.out.println("==================================");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine(); // Buffer clear

                    System.out.print("Enter Username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    User user = new User(username, password);

                    users.add(user);

                    System.out.println("Signup Successful!");

                    break;
                case 2:

                    sc.nextLine();

                    System.out.print("Enter Username: ");
                    String loginUser = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPass = sc.nextLine();

                    boolean found = false;

                    for (User u : users) {

                        if (u.getUsername().equals(loginUser)
                                && u.getPassword().equals(loginPass)) {

                            found = true;
                            break;
                        }
                    }

                    if (found) {

                        System.out.println("Login Successful!");

                        while (true) {

                            System.out.println("1. Add Student");
                            System.out.println("2. View Students");
                            System.out.println("3. Mark Attendance");
                            System.out.println("4. Search Student");
                            System.out.println("5. Logout");

                            System.out.print("Enter Choice: ");
                            int dashboardChoice = sc.nextInt();

                            switch (dashboardChoice) {

                                case 1:

                                    sc.nextLine();

                                    System.out.print("Student ID: ");
                                    int id = sc.nextInt();

                                    sc.nextLine();

                                    System.out.print("Student Name: ");
                                    String name = sc.nextLine();

                                    System.out.print("Course: ");
                                    String course = sc.nextLine();

                                    Student student = new Student(id, name, course);

                                    manager.addStudent(student);

                                    break;

                                case 2:

                                    manager.viewStudents();

                                    break;

                                case 3:

                                    System.out.print("Enter Student ID: ");
                                    int studentId = sc.nextInt();

                                    manager.markAttendance(studentId);

                                    break;

                                case 4:

                                    System.out.print("Enter Student ID: ");
                                    int searchId = sc.nextInt();

                                    manager.searchStudent(searchId);

                                    break;
                                case 5:

                                    System.out.println("Logout Successful!");
                                    break;
                                default:

                                    System.out.println("Invalid Choice!");
                            }

                            if (dashboardChoice == 5) {
                                break;
                            }
                        }

                    } else {

                        System.out.println("Invalid Username or Password!");

                    }

                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}