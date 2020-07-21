package com.yasinderu;

import java.util.Scanner;

public class Teacher {
    private int salary;
    private static int ID = 1600;
    private int salaryEarned;
    private String teacherId;
    private String name;


    public Teacher() {
        this.name = setName();
        setID();
        this.salary = setSalary();
    }

    private String setName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter teacher name : ");
        String name = in.nextLine();
        return name;
    }

    private void setID() {
        ID++;
        this.teacherId = "T" + ID;
    }


    public int setSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter teacher salary : $");
        int salary = in.nextInt();
        return salary;
    }

    public void payTeacherSalary() {
        this.salaryEarned+=this.salary;
        School.updateTotalMoneySpent(this.salary);
    }

    public void getInfo() {
        System.out.println("Name : " + name + "\nID : " + teacherId + "\nSalary : " + salary + "\n");
    }
}
