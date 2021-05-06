package com.val;

public class Course {
    private String courseName;
    private String[] students = new String[3];
    private int numberOfStudents;

    // Constructor with required courseName parameter
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Adds students to course, if students maxed out, create new array to add new students
    public void addStudent(String student) {
        if(numberOfStudents == students.length) {
             String[] updatedStudentRoster = new String[students.length +1];
            for(int i = 0; i < students.length; i++) updatedStudentRoster[i] = students[i];
            students = updatedStudentRoster;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
        //for(String s: students) System.out.println(s); // Debugger
    }

    // Drops a student from the course roster
    public void dropStudent(String student) {
        String[] updatedStudentRoster = new String[students.length];
        for(int i = 0; i < students.length; i++) {
            if(students[i].equals(student)) updatedStudentRoster[i] = null;
            else updatedStudentRoster[i] = students[i];

        }
        students = updatedStudentRoster;
        numberOfStudents--;

        //for(String s: students) System.out.println(s); // Debugger
    }

    // Gets students in the course, returns an array w/ length based on # of students
    public String[] getStudents() {
        String[] updatedStudentRoster = new String[numberOfStudents];
        for(int i = 0; i < numberOfStudents; i++) updatedStudentRoster[i] = students[i];
        students = updatedStudentRoster;

        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Clear all students from the course
    public void clear(String[] students) {
        for(int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        for(String s: students) System.out.println(s); // Debugger
    }
}
