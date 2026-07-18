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
            System.out.println("------------------------");
        }
    }
}