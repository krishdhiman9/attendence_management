package com.attendance;

import java.util.ArrayList;

public class AttendanceManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student s : students) {

            System.out.println("ID      : " + s.getId());
            System.out.println("Name    : " + s.getName());
            System.out.println("Course  : " + s.getCourse());
            System.out.println("Status  : " + (s.isPresent() ? "Present" : "Absent"));
            System.out.println("------------------------");
        }

    }
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.println("\n===== Student Found =====");
                System.out.println("ID      : " + student.getId());
                System.out.println("Name    : " + student.getName());
                System.out.println("Course  : " + student.getCourse());
                System.out.println("Status  : " + (student.isPresent() ? "Present" : "Absent"));

                return;
            }
        }

        System.out.println("Student Not Found!");
    }
        public void markAttendance(int id) {

            for (Student student : students) {

                if (student.getId() == id) {

                    student.setPresent(true);

                    System.out.println("Attendance Marked Successfully!");

                    return;
                }
            }

            System.out.println("Student Not Found!");
        }

}