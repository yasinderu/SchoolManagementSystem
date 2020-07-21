package com.yasinderu;

import java.util.Scanner;

public class Student {
    private int studentFees;
    private int grade;
    private int totalFees = 30000;
    private static int ID = 1000;
    private String studentId;
    private String name;

    public Student() {
        this.name = setName();
        this.grade = setGrade();

        setId();
    }

    private String setName() {
        System.out.print("Enter student name : ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return name;
    }

    private int setGrade() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student grade : ");
        System.out.println("1 - Junior \n2 - Middle \n3 - Senior");
        int grade = in.nextInt();
        return grade;
    }

    private void setId() {
        ID++;
        this.studentId = grade + "" + ID;
    }

    public void payFees() {
        System.out.print("Enter student payment amount: $");
        Scanner in = new Scanner(System.in);
        this.studentFees += in.nextInt();
        this.totalFees-=studentFees;
        School.updateTotalMoneyEarned(this.studentFees);
        System.out.println("Thank you, your payment has been recorded.\nTotal amount of student fees : " + totalFees + "\n");
    }

    public void getInfo() {
        System.out.println("Name : " + name + "\nID : " + studentId + "\nGrade : " + grade + "\nTotal Fees : " + totalFees + "\n");
    }
}
