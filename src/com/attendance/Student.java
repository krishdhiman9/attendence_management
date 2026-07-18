package com.attendance;

public class Student {

    private int id;
    private String name;
    private String course;
    private boolean present;

    // Constructor
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.present = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
    public boolean isPresent() {
        return present;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }
}

