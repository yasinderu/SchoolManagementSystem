package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Teacher emilia = new Teacher();
//        Student james = new Student();
        System.out.print("Enter number of teachers : ");

        Scanner in = new Scanner(System.in);
        int numOfTeachers = in.nextInt();
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        for (int i=0; i<numOfTeachers; i++) {
            teachers.add(new Teacher());
        }

        System.out.print("Enter number students : ");
        int numOfStudents = in.nextInt();

        for(int j=0; j<numOfStudents; j++) {
            students.add(new Student());
            students.get(j).payFees();
        }

        School school = new School(teachers, students);
        teachers.get(0).payTeacherSalary();
        teachers.get(1).payTeacherSalary();
        school.getInfo();
    }
}
