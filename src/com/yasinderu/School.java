package com.yasinderu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalSchoolMoney = 0;
    private static int totalMoneyEarned = 0;
    private static int totalMoneySpent = 0;

//    public School(Teacher teacher, Student student) {
//        this.teachers = new ArrayList<>();
//        this.students = new ArrayList<>();
//        teachers = addTeacher(teacher);
//        students = addStudent(student);
//    }

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public List<Teacher> addTeacher(Teacher teacher) {
        teachers.add(teacher);
        return teachers;
    }

    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public static void updateTotalMoneyEarned(int amount) {
        totalMoneyEarned+=amount;
        totalSchoolMoney = totalMoneyEarned;
    }

    public static void updateTotalMoneySpent(int amount) {
        totalMoneySpent+=amount;
        totalSchoolMoney-=totalMoneySpent;
    }

    public void getInfo() {
        System.out.println("School Information");
        System.out.println("Teachers \n");
        for (int i=0; i<teachers.size(); i++) {
            teachers.get(i).getInfo();
        }
        System.out.println("");
        System.out.println("Students \n");
        for(int i=0; i<students.size(); i++) {
            students.get(i).getInfo();
        }
        System.out.println("Total school earning : $" + totalMoneyEarned);
        System.out.println("Total school spending : $" + totalMoneySpent);
        System.out.println("Total School budget : $" + totalSchoolMoney);
    }
}
